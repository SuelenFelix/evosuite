package icu.samnyan.aqua.sega.diva.model.response.ingame;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StageResultResponse_getSkinnameary_83079004327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24309;

    public StageResultResponse_getSkinnameary_83079004327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24309 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term24504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24509 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24309, term24309.getClass(), "chllng_kind", -138239905);
        setIntField(term24309, term24309.getClass(), "lv_num_old", 1709474063);
        setIntField(term24309, term24309.getClass(), "lv_pnt_old", 1406617209);
        setIntField(term24309, term24309.getClass(), "lv_num", 1706047059);
        setIntField(term24309, term24309.getClass(), "lv_pnt", 590451710);
        setField(term24309, term24309.getClass(), "lv_str", "uOJFOUcNvv");
        setIntField(term24309, term24309.getClass(), "lv_efct_id", -1999787419);
        setIntField(term24309, term24309.getClass(), "lv_plt_id", -1224443634);
        setIntField(term24309, term24309.getClass(), "vcld_pts", 1048451946);
        setIntField(term24309, term24309.getClass(), "prsnt_vcld_pts", 5603560);
        setIntField(term24309, term24309.getClass(), "cnp_cid", -1079020032);
        setIntField(term24309, term24309.getClass(), "cnp_val", -1973791064);
        setField(term24309, term24309.getClass(), "cnp_sp", "tkmmGweDwJ");
        setField(term24309, term24309.getClass(), "crwd_kind", "pMfTuAFXxg");
        setField(term24309, term24309.getClass(), "crwd_value", "XCZmhkblRc");
        setField(term24309, term24309.getClass(), "crwd_str_0", "gFUWMydGCU");
        setField(term24309, term24309.getClass(), "crwd_str_1", "LLegSTfqJt");
        setIntField(term24309, term24309.getClass(), "cerwd_kind", -2072158633);
        setIntField(term24309, term24309.getClass(), "cerwd_value", -355469363);
        setField(term24309, term24309.getClass(), "cerwd_str_0", "XQfmqLbqHS");
        setField(term24309, term24309.getClass(), "cerwd_str_1", "jLVLqQSjqg");
        setField(term24309, term24309.getClass(), "ttl_str_ary", "JKGueoHesL");
        setField(term24309, term24309.getClass(), "ttl_plt_id_ary", "CRAUqtVBkU");
        setField(term24309, term24309.getClass(), "ttl_desc_ary", "DddqUYfomL");
        setField(term24309, term24309.getClass(), "skin_id_ary", "YQwoogpPyi");
        setField(term24309, term24309.getClass(), "skin_name_ary", "rnPhHoorxj");
        setField(term24309, term24309.getClass(), "skin_illust_ary", "GuwJLKquuI");
        setField(term24309, term24309.getClass(), "skin_desc_ary", "vYMCjgnztg");
        setIntField(term24309, term24309.getClass(), "pdddt_flg", 1465188553);
        setIntField(term24505, term24505.getClass(), "year", 2028);
        setShortField(term24505, term24505.getClass(), "month", (short) 10);
        setShortField(term24505, term24505.getClass(), "day", (short) 1);
        setField(term24504, term24504.getClass(), "date", term24505);
        setByteField(term24509, term24509.getClass(), "hour", (byte) 17);
        setByteField(term24509, term24509.getClass(), "minute", (byte) 29);
        setByteField(term24509, term24509.getClass(), "second", (byte) 30);
        setIntField(term24509, term24509.getClass(), "nano", 845472306);
        setField(term24504, term24504.getClass(), "time", term24509);
        setField(term24309, term24309.getClass(), "pdddt_tm", term24504);
        setIntField(term24309, term24309.getClass(), "nblss_ltt_stts", 1633913667);
        setIntField(term24309, term24309.getClass(), "nblss_ltt_tckt", 1292332296);
        setIntField(term24309, term24309.getClass(), "nblss_ltt_is_opn", -1415256843);
        setIntField(term24309, term24309.getClass(), "nblss_ltt_prz", 612177768);
        setIntField(term24309, term24309.getClass(), "nblss_ltt_nxt_stts", -1626451656);
        setIntField(term24309, term24309.getClass(), "nblss_ltt_nxt_tckt", 173952451);
        setField(term24309, term24309.getClass(), "my_qst_id", "YupgKTSEiI");
        setField(term24309, term24309.getClass(), "my_qst_r_qid", "HuOUlaFmvJ");
        setField(term24309, term24309.getClass(), "my_qst_r_knd", "dWVwcwFGNo");
        setField(term24309, term24309.getClass(), "my_qst_r_vl", "PNdLRrSAIY");
        setField(term24309, term24309.getClass(), "my_qst_r_nflg", "nJnRIRiLZK");
        setField(term24309, term24309.getClass(), "my_ccd_r_qid", "eWnrMSbYbT");
        setField(term24309, term24309.getClass(), "my_ccd_r_hnd", "AjoFvDFyCY");
        setField(term24309, term24309.getClass(), "my_ccd_r_vp", "OFTJwdPiTG");
        setField(term24309, term24309.getClass(), "cmd", "QiUprSEluR");
        setField(term24309, term24309.getClass(), "req_id", "cDOXXottZh");
        setField(term24309, term24309.getClass(), "stat", "rfqJDkDppz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkin_name_ary", argTypes, term24309, args);
    }

};


