package pl.lodz.p.pbsir.credlogger;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String user;
    private String password;
}
