package com.study.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Frank on 2016/12/26.
 */
public class UserServiceImpl implements UserService {

    @Override
    public boolean userNeedCondiment() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String ans = br.readLine();
            if (ans != null && ans.startsWith("y")){
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
