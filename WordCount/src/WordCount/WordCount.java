package WordCount;

import java.util.*;

public class Main
{

	public static void main(String[] args)
	{
		String rightsDeclaration = new TheText.getTheText();

		rightsDeclaration = rightsDeclaration.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");

		String[] wordsArray = rightsDeclaration.split(" +");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String oneWord:wordsArray)
		{
			if (!map.containsKey(oneWord))
			{
				map.put(oneWord, 1);
			}
			else
			{
				map.put(oneWord, map.get(oneWord + 1));
			}
	}

ArrayList<HashMap.Entry<String, Integer>> sortedMap = new ArrayList<HashMap.Entry<String, Integer>>();
sortedMap.addAll(map.entrySet());

Collections.sort(sortedMap, new Comparator<Map.Entry<String, Integer>>()
{
	public int compare (HashMap.Entry<String, Integer> o1, HashMap.Entry<String, Integer> o2)
	{
		return o2.getValue() - o1.getValue();
	}
});















}