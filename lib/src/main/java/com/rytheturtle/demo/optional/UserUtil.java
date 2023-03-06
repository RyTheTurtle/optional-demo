/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.rytheturtle.demo.optional;

import com.rytheturtle.demo.optional.user.*; 
import com.rytheturtle.demo.optional.user.address.*;
import java.util.*;
import java.util.stream.*;

public class UserUtil {

    private static final Set<String> storeZipCodes = Stream.of("80208").collect(Collectors.toCollection(HashSet::new));

    private UserUtil(){}
    
    public static boolean isNearPhysicalLocation(User user) {
        Optional<String> zip = Optional.ofNullable(user)
                                .map(u -> u.getAddress())
                                .map(a -> a.getState())
                                .map(s -> s.getPostalCode())
                                .map(p -> p.getZip());
        return storeZipCodes.contains(zip.orElse(""));
    }

}
