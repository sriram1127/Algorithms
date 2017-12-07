package com.saggezza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixStep {
	int step;

	public static void main(String[] args) {

		MatrixStep ms = new MatrixStep();
		String[][] matrix = ms.readMatrix();
		matrix = ms.rotateMatrixLayer(matrix);
		ms.printMatrix(matrix);
	}

	public String[][] rotateMatrixLayer(String[][] matrix) {
		boolean complete = false;
		int startRow = 0;
		int startCol = 0;
		int row = matrix.length;
		int col = matrix[0].length;
		String[][] rotatedMatrix = new String[row][col];
		List<String> record;
		List<List<String>> records = new ArrayList<List<String>>((Math.max(row, col) / 2) + 1);
		while (!complete) {

			int maxR = row - startRow;
			int maxC = col - startCol;

			record = new ArrayList<String>(maxR * 2 + maxC * 2);

			for (int j = startCol; j < maxC; j++) {
				record.add(matrix[startRow][j]);
			}

			for (int i = startRow + 1; i < maxR - 1; i++) {
				record.add(matrix[i][maxC - 1]);
			}

			for (int j = maxC - 1; j >= startCol; j--) {
				record.add(matrix[maxR - 1][j]);
			}

			for (int i = maxR - 2; i >= startRow + 1; i--) {
				record.add(matrix[i][startCol]);
			}
			records.add(record);
			++startRow;
			++startCol;

			if (startCol > (col / 2) || startRow > (row / 2)) {
				complete = true;
			}
		}
		for (List<String> list : records) {
			rotate(list);
		}
		startRow = 0;
		startCol = 0;
		int layerCount = 0;
		complete = false;
		while (!complete) {
			int maxRows = row - startRow;
			int maxCols = col - startCol;
			record = records.get(layerCount++);
			for (int j = startCol; j < maxCols; j++) {
				rotatedMatrix[startRow][j] = record.remove(0);
			}
			for (int i = startRow + 1; i < maxRows - 1; i++) {
				rotatedMatrix[i][maxCols - 1] = record.remove(0);
			}
			for (int j = maxCols - 1; j >= startCol; j--) {
				rotatedMatrix[maxRows - 1][j] = record.remove(0);
			}

			for (int i = maxRows - 2; i >= startRow + 1; i--) {
				rotatedMatrix[i][startCol] = record.remove(0);
			}
			records.add(record);
			++startRow;
			++startCol;

			if (startCol > (col / 2) || startRow > (row / 2)) {
				complete = true;
			}
		}
		return rotatedMatrix;
	}

	private void rotate(List<String> elements) {
		if (elements.size() != 0) {
			int rotate = this.step;
			int length = elements.size();
			if (rotate > length) {
				rotate = rotate - (rotate / length) * length;
			}
			for (int i = 0; i < rotate; i++) {
				String n = elements.remove(0);
				elements.add(n);
			}
		}
	}

	public String[][] readMatrix() {

		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		this.step = scanner.nextInt();
		this.step = this.step % (2 * (row + col) - 4);
		String[][] matrix = new String[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = scanner.next();
			}
		}

		return matrix;
	}

	public void printMatrix(String[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
