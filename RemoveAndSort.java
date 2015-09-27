package com.test.venturesity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveAndSort {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        List<String> unSorted = new ArrayList<String>();
        Set<String> uniqueElemnts = new HashSet<String>();
        for (int i = 0; i < N; i++) {
        	unSorted.add(br.readLine());
        }
        uniqueElemnts.addAll(unSorted);
        unSorted.clear();
        unSorted.addAll(uniqueElemnts);
        Collections.sort(unSorted);
        Iterator listIterator = unSorted.iterator();
        while(listIterator.hasNext()){
        	System.out.println(listIterator.next());
        }
	}

}
