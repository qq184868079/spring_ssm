import com.qingfeng.domain.Account;
import com.qingfeng.service.impl.AccountServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @PackageName: PACKAGE_NAME
 * @ClassName: Demo
 * @Author: QingFeng
 * @Date: 2019-11-19 20:29
 * @Description: //TODO
 */

public class Demo {

    @Test
    public void test(){
        AccountServiceImpl accountService = new AccountServiceImpl();
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }

}
