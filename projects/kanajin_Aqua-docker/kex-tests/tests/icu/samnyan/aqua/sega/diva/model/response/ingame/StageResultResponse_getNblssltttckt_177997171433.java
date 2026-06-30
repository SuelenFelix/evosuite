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

public class StageResultResponse_getNblssltttckt_177997171433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27927;

    public StageResultResponse_getNblssltttckt_177997171433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27927 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term28122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28127 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27927, term27927.getClass(), "chllng_kind", -2129828854);
        setIntField(term27927, term27927.getClass(), "lv_num_old", -47438786);
        setIntField(term27927, term27927.getClass(), "lv_pnt_old", -1955400589);
        setIntField(term27927, term27927.getClass(), "lv_num", 626179200);
        setIntField(term27927, term27927.getClass(), "lv_pnt", -511077684);
        setField(term27927, term27927.getClass(), "lv_str", "JukEMhPWql");
        setIntField(term27927, term27927.getClass(), "lv_efct_id", -711507760);
        setIntField(term27927, term27927.getClass(), "lv_plt_id", 1053773809);
        setIntField(term27927, term27927.getClass(), "vcld_pts", 924127883);
        setIntField(term27927, term27927.getClass(), "prsnt_vcld_pts", -751079123);
        setIntField(term27927, term27927.getClass(), "cnp_cid", -110837188);
        setIntField(term27927, term27927.getClass(), "cnp_val", -271094506);
        setField(term27927, term27927.getClass(), "cnp_sp", "ZdNcodHERG");
        setField(term27927, term27927.getClass(), "crwd_kind", "CLHomjAqIM");
        setField(term27927, term27927.getClass(), "crwd_value", "mzCFLzFuSj");
        setField(term27927, term27927.getClass(), "crwd_str_0", "WQnMpDlSfA");
        setField(term27927, term27927.getClass(), "crwd_str_1", "aOIvTQtXiv");
        setIntField(term27927, term27927.getClass(), "cerwd_kind", 455632030);
        setIntField(term27927, term27927.getClass(), "cerwd_value", -1632929393);
        setField(term27927, term27927.getClass(), "cerwd_str_0", "IyjDiknqhA");
        setField(term27927, term27927.getClass(), "cerwd_str_1", "IHsXSAFYKi");
        setField(term27927, term27927.getClass(), "ttl_str_ary", "KyGbLglqbW");
        setField(term27927, term27927.getClass(), "ttl_plt_id_ary", "ZKVeStsSNT");
        setField(term27927, term27927.getClass(), "ttl_desc_ary", "cqCXYaAnFB");
        setField(term27927, term27927.getClass(), "skin_id_ary", "UPLNFZHXjw");
        setField(term27927, term27927.getClass(), "skin_name_ary", "CwrrJlrGmg");
        setField(term27927, term27927.getClass(), "skin_illust_ary", "HejzvyejjG");
        setField(term27927, term27927.getClass(), "skin_desc_ary", "pbqJjeooBM");
        setIntField(term27927, term27927.getClass(), "pdddt_flg", -431440129);
        setIntField(term28123, term28123.getClass(), "year", 2012);
        setShortField(term28123, term28123.getClass(), "month", (short) 3);
        setShortField(term28123, term28123.getClass(), "day", (short) 27);
        setField(term28122, term28122.getClass(), "date", term28123);
        setByteField(term28127, term28127.getClass(), "hour", (byte) 17);
        setByteField(term28127, term28127.getClass(), "minute", (byte) 49);
        setByteField(term28127, term28127.getClass(), "second", (byte) 24);
        setIntField(term28127, term28127.getClass(), "nano", 530647398);
        setField(term28122, term28122.getClass(), "time", term28127);
        setField(term27927, term27927.getClass(), "pdddt_tm", term28122);
        setIntField(term27927, term27927.getClass(), "nblss_ltt_stts", -763576148);
        setIntField(term27927, term27927.getClass(), "nblss_ltt_tckt", 1568948514);
        setIntField(term27927, term27927.getClass(), "nblss_ltt_is_opn", -1511130237);
        setIntField(term27927, term27927.getClass(), "nblss_ltt_prz", 452088587);
        setIntField(term27927, term27927.getClass(), "nblss_ltt_nxt_stts", -1630069454);
        setIntField(term27927, term27927.getClass(), "nblss_ltt_nxt_tckt", 1499735894);
        setField(term27927, term27927.getClass(), "my_qst_id", "ccnotFfPXt");
        setField(term27927, term27927.getClass(), "my_qst_r_qid", "plWlgdgIhn");
        setField(term27927, term27927.getClass(), "my_qst_r_knd", "RZaKVKWtND");
        setField(term27927, term27927.getClass(), "my_qst_r_vl", "vXiaNiquft");
        setField(term27927, term27927.getClass(), "my_qst_r_nflg", "lucCeiVnYe");
        setField(term27927, term27927.getClass(), "my_ccd_r_qid", "iYwkCLMsbJ");
        setField(term27927, term27927.getClass(), "my_ccd_r_hnd", "MXLsVQWrwc");
        setField(term27927, term27927.getClass(), "my_ccd_r_vp", "lRaSlqzqNY");
        setField(term27927, term27927.getClass(), "cmd", "TiEyxWXsra");
        setField(term27927, term27927.getClass(), "req_id", "TuLgwTZsPP");
        setField(term27927, term27927.getClass(), "stat", "KoasxTJGpx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_tckt", argTypes, term27927, args);
    }

};


