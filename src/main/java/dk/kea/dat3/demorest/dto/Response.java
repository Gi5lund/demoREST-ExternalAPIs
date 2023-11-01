package dk.kea.dat3.demorest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Gender {
	String gender;
	String name;
	int count;
	double probability;
}
