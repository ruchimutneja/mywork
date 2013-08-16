import static java.lang.Character.isDigit;

public class Calculator {

        public int returnResults(String Expression) {

            String numericValues[] = new String[10];
            int sumResult = 0;
            int productResult=1;
            int j=0;
            numericValues[j] = "";

            for (int i = 0; i < Expression.length()-1; i++) {

                if (isDigit(Expression.charAt(i))) {
                    numericValues[j] += Expression.charAt(i);
                }
                else
                {
                    if (Expression.charAt(Expression.length()-1) == '+')
                        sumResult += Integer.parseInt(numericValues[j]);
                    else if (Expression.charAt(Expression.length()-1) == '*')
                        productResult *= Integer.parseInt(numericValues[j]);
                    j++;

                    numericValues[j] = "";

                }
            }
            if(Expression.charAt(Expression.length()-1)=='+')
                return sumResult;
            else
                return productResult;

        }
    }


