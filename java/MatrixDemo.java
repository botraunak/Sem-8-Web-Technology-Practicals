import java.util.Scanner;
class Matrix{
	int[][] matrix;
	int m,n;
	Matrix(int m,int n)
	{
		this.m=m;
		this.n=n;
		matrix=new int[m][n];
		enterMatrix();
		}
	void enterMatrix()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				System.out.print("Enter the value( "+i);
				System.out.print(", "+j+" ) : ");
				matrix[i][j]=sc.nextInt();
			}
			System.out.println();
		}
	}
	void addition(Matrix second)
	{
		if(second.m==this.m && second.n==this.n)
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					this.matrix[i][j]+=second.matrix[i][j];
				}
			}
		}
		else
		{
			System.out.println("Invalid size of matrix");
		}
	}
	void subtraction(Matrix second)
	{
		if(second.m==this.m && second.n==this.n)
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					this.matrix[i][j]-=second.matrix[i][j];
				}
			}
		}
		else
		{
			System.out.println("Invalid size of matrix");
		}
	}
	void transpose()
	{
		if(m==n)
		{
			for(int i=0;i<m;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					int temp=this.matrix[i][j];
					this.matrix[i][j]=matrix[j][i];
					this.matrix[j][i]=temp;
				}
				
			}
		}
		else
		{
			System.out.println("invalid size");
		}
	}
	void multiplication(Matrix second)
	{
		if(this.n==second.m)
		{
			int array[][]=new int[m][second.n];
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int k=0;k<n;k++)
					{
						array[i][j]=array[i][j]+matrix[i][k]*second.matrix[k][j];
					}
					}
			}
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<second.n;j++)
				{
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Invalid size of matrix");
		}
	}
	public String toString()
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		return " ";
	}
}
class MatrixDemo
{
	public static void main(String[] args)
	{
		Matrix m=new Matrix(3,3);
		Matrix m1=new Matrix(3,3);
		// Print First Matrix
		System.out.println(m);
		// Adding m1 to m1
		m.addition(m1);
		// Display Result
		System.out.println(m);
		// Subtracting m1 from m
		m.subtraction(m1);
		// Display Result
		System.out.println(m);
		// Multiply m1 to m
		m.multiplication(m1);
		// Display Result
		System.out.println(m);
		// Transpose matrix m
		m.transpose();
		// Display result
		System.out.println(m);
	}
}