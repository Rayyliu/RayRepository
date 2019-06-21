package dbTest;

import com.xyd.mybatis.mapper.ApplyLoanMapper;
import com.xyd.mybatis.model.ApplyLoan;
import com.xyd.mybatis.model.ApplyLoanExample;
import org.junit.Test;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


public class DBTest {

    @Resource
    private ApplyLoanMapper applyLoanMapper;

    protected ApplyLoan findEmaiSendByBizOrderNo(String loanNumber) {

        ApplyLoanExample example = new ApplyLoanExample();
        example.createCriteria().andLoanNumberEqualTo(loanNumber);
        ApplyLoan applyLoan = applyLoanMapper.selectByExample(example).get(0);
        return applyLoan;
    }

    @Test
    public void selectApplyLoan(){
        ApplyLoan information = findEmaiSendByBizOrderNo("2019BJS592052717214220G");
        System.out.println(information);

    }
}

