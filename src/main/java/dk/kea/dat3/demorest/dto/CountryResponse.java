package dk.kea.dat3.demorest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Country
	{
		int count;
		String name;
		List<Country> countries=new ArrayList<>();
	}
