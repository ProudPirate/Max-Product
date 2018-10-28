public static void main (String[] args) throws java.lang.Exception
	{
	    int n=0, k=0, sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] val = new Integer[1];
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++){
		    StringTokenizer sc = new StringTokenizer(br.readLine());
		    n = Integer.parseInt(sc.nextToken());
		    k = Integer.parseInt(sc.nextToken());
                    //System.out.println(n+"\n"+k);
                    int x, y;
                    for(int j=1; j<n; j++){
                        for(int l=j+1; l<n; l++){
                            if(j+l == n){
//                                System.out.println("x="+j+"y="+(l));
                                int index = 0;
//                                  val[index++] = j; 
//                                  val[index++] = l;
                                  val[index++] = (int)(((Math.pow(j, 2)) - j) * ((Math.pow(l, 2)) - l));
                                  
//                                System.out.println("size"+ val.ca);
//                                
                            }
                        }
                    }
                    int max = Collections.max(Arrays.asList(val));
                    System.out.println(max);
//                    for(int indexes = 0; indexes<val.length; indexes++)
//                        System.out.println("val: " + val[indexes]);
		}
	}