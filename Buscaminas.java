			} while (x >= tamanyo);
				do {
					System.out.println("Donde quieres de la y quieres tirar?");
					y = Integer.parseInt(sc.nextLine());
					if (y >= tamanyo) {
						System.out.println("Ese numero no es correcto escoge otro numero porfavor");
					}
				} while (y >= tamanyo);
				if (abiertos[x][y]==true) {
					System.out.println("No puedes tirar ahi");
				}
			} while (abiertos[x][y]==true);
				marcarbomba(marcas,x,y);			
				tirar(tablero, abiertos, x, y);
				
		} while (tablero[x][y]!=9 && Condiciondevictoria(abiertos, tablero)==false);





		MuestraTablero(abiertos, tablero, marcas);
		if (tablero[x][y]==9) {
			Destapaminas(abiertos,tablero);
			System.out.println();
			System.out.println("Has perdido espabilao");
		}else {
			System.out.println();
			System.out.println("Has ganao");

		}
	}

	public static void marcarbomba(boolean[][] Marcas, int x, int y) {
		System.out.println("¿Quieres marcar donde hay alguna bomba? (s/n)");
		String respuesta;
		respuesta=sc.nextLine();
		if (respuesta.equals("s")) {
			System.out.println("¿Posicion de la x donde esta la bomba?");
			int posicionx=Integer.parseInt(sc.nextLine());
			System.out.println("¿Posicion de la y donde esta la bomba?");
			int posiciony=Integer.parseInt(sc.nextLine());
			Marcas[posicionx][posiciony]=true;

		}
	}




	public static boolean Condiciondevictoria(boolean[][] abiertos, int[][] tablero) {
		int contadorminas=0;
		for (int y=0; y<abiertos[0].length ; y++) {
			for (int x=0; x<abiertos.length; x++) {

				if (abiertos[x][y]==false){
					contadorminas++;

				}
			}
		}
		if (contadorminas==(int)(tablero.length*tablero[0].length*0.10)) {
			return true;
		}
		return false;
	}



	public static void tirar(int[][]tablero,boolean[][]abiertos,int tx,int ty) {
		abiertos [tx][ty]=true;
		if (tablero [tx][ty]==0) {
			for (int y=ty-1; y<=ty+1;y++){
				for (int x=tx-1;x<=tx+1;x++) {
					if (posicioncorrecta(y,x,tablero)) {
						if (abiertos[x][y]==false) {
							tirar(tablero,abiertos,x,y);
						}
					}
				}
			}

		}
	}


	public static void NumerosAlrededor(int[][] tablero) {

		for (int y=0; y<tablero[0].length ; y++) {
			for (int x=0; x<tablero.length; x++) {
				if (tablero[x][y]!=9) {
					int bombas=0;
					for (int Y2=y-1; Y2<=y+1;Y2++) {
						for (int X2=x-1; X2<=x+1;X2++) {

							if(posicioncorrecta (X2, Y2, tablero) && tablero[X2][Y2]==9) {
								bombas++;
							}
						}
					}
					tablero[x][y]=bombas;
				}

			}
		}

	}

	public static boolean posicioncorrecta(int x, int y, int[][] tablero) {
		if (x>=0 && x<tablero.length && y>=0 && y<tablero[0].length) {
			return true;
		}
		return false;
	}

	public static void LasBombasJAJA(int[][] tablero) {
		int numerobombas=(int) (tablero.length*tablero.length*0.10);
		int max=tablero.length;
		int x,y;
		for (int contador=0; contador<numerobombas; contador++) {

			do {
				y=(int) (Math.random() * (max));
				x=(int) (Math.random() * (max));
			} while (tablero[x][y]==9);
			tablero[x][y]=9;
		}
	}

	public static void MuestraTablero(boolean[][] abiertos, int[][] tablero, boolean[][]Marcas) {
		System.out.print("    ");
		for (int num=0;num<tablero.length; num++){
			if (num<10) {
				System.out.print(+num+"  ");
			}else {
				System.out.print(num+" ");
			}
		}
		System.out.println();
		System.out.print("  ┌");
		for (int y=0; y<tablero.length; y++) {

			System.out.print("───");

		}
		System.out.println("┐");
		for (int y=0; y<tablero[0].length; y++) {
			if(y<10) {
				System.out.print(" "+y+"│");
			}else{
				System.out.print(y+"│");
			}
			for (int x=0;x<tablero.length; x++) {
				if (abiertos [x][y]==false) {
					if (Marcas[x][y]==false) {
						System.out.print("▒▒▒");
					}else {
						System.out.print(" ┌ ");
					}
				}else {
					if (tablero[x][y]==0) {
						System.out.print("   ");
					}else if (tablero[x][y]==9) {
						System.out.print(" ☼ ");
					}else {
						System.out.print(" "+tablero[x][y]+" ");
					}
				}
			}
			System.out.println("│"+y);
		}
		System.out.print("  └");
		for (int y=0;y<tablero.length;y++) {
			System.out.print("───");
		}
		System.out.println("┘");
		System.out.print("    ");
		for (int num=0;num<tablero.length; num++){
			if (num<10) {
				System.out.print(+num+"  ");
			}else {
				System.out.print(num+" ");
			}
		}
	}

	public static void InicializaAbiertos(boolean[][] abiertos) {
		for (int y=0; y<abiertos[0].length ; y++) {
			for (int x=0; x<abiertos.length; x++) {

				abiertos[x][y]=false;		
			}
		}

	}

	public static void Destapaminas(boolean[][] abiertos,int[][]tablero) {
		for (int y=0; y<tablero[0].length ; y++) {
			for (int x=0; x<tablero.length; x++) {
				if (tablero [x][y]==9) {
					abiertos[x][y]=true;
				}

			}
		}

	}





} 

