package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Eslam";
        } else if(query.contains("color")) { // TODO extend the programm here
            return "yellow";
        }else if(query.contains("which of the following numbers are primes: 340, 251")) { // TODO extend the programm here
            return "251";
        }
        else if(query.contains("which of the following numbers is the largest: 364, 919, 70, 66")) { // TODO extend the programm here
            return "919";
        }
        else if(query.contains("which of the following numbers is the largest: 447, 500, 84, 2")) { // TODO extend the programm here
            return "500";
        }

        return "";
    }
}
