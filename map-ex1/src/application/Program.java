package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> totalVotes = new TreeMap<>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);
				int sum = votes;
				
				if(!totalVotes.containsKey(name)) {
					totalVotes.put(name, votes);					
				}
				else {
					sum += totalVotes.get(name);
					totalVotes.put(name, sum);
				}
				line = br.readLine();
			}
			
			for(String key : totalVotes.keySet()) {
				System.out.println(key + ": " + totalVotes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
