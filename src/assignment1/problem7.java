package assignment1;

public class problem7 {

        public static void main( String[] args )
        {

            for ( int a = 1; a <= 500; a++ )
            {
                for ( int b = 1; b <= 500; b++ )
                {
                    for ( int c = 1; c <= 500; c++ )
                    {

                        if( (a * a) + (b * b) == (c * c) )
                            {
                                System.out.printf("%d, %d, %d", a, b, c);
                              System.out.println();
                            }
                        }
                    }
                }
            }

        }


