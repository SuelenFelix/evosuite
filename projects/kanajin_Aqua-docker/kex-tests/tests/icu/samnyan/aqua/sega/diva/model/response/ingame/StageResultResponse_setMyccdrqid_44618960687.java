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

public class StageResultResponse_setMyccdrqid_44618960687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60979;

    public StageResultResponse_setMyccdrqid_44618960687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60979 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term61174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61179 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term60979, term60979.getClass(), "chllng_kind", 1674165862);
        setIntField(term60979, term60979.getClass(), "lv_num_old", 1875252647);
        setIntField(term60979, term60979.getClass(), "lv_pnt_old", -1298688401);
        setIntField(term60979, term60979.getClass(), "lv_num", 1907832341);
        setIntField(term60979, term60979.getClass(), "lv_pnt", 932199784);
        setField(term60979, term60979.getClass(), "lv_str", "faFVBESzWc");
        setIntField(term60979, term60979.getClass(), "lv_efct_id", 1953620444);
        setIntField(term60979, term60979.getClass(), "lv_plt_id", -1111307978);
        setIntField(term60979, term60979.getClass(), "vcld_pts", 609697271);
        setIntField(term60979, term60979.getClass(), "prsnt_vcld_pts", 1121247998);
        setIntField(term60979, term60979.getClass(), "cnp_cid", -710001354);
        setIntField(term60979, term60979.getClass(), "cnp_val", 2007404429);
        setField(term60979, term60979.getClass(), "cnp_sp", "baFwYJAfPz");
        setField(term60979, term60979.getClass(), "crwd_kind", "PxBSOwkatN");
        setField(term60979, term60979.getClass(), "crwd_value", "uKjlgaHcoc");
        setField(term60979, term60979.getClass(), "crwd_str_0", "ITJMSWaPGZ");
        setField(term60979, term60979.getClass(), "crwd_str_1", "ivvEvcUacU");
        setIntField(term60979, term60979.getClass(), "cerwd_kind", 472580433);
        setIntField(term60979, term60979.getClass(), "cerwd_value", 1189049164);
        setField(term60979, term60979.getClass(), "cerwd_str_0", "gbSukHPGfP");
        setField(term60979, term60979.getClass(), "cerwd_str_1", "jEDnJjwhoo");
        setField(term60979, term60979.getClass(), "ttl_str_ary", "TkTHRRicKc");
        setField(term60979, term60979.getClass(), "ttl_plt_id_ary", "xwBoTnuoQg");
        setField(term60979, term60979.getClass(), "ttl_desc_ary", "HHAcgDPghN");
        setField(term60979, term60979.getClass(), "skin_id_ary", "GzmFcFoYft");
        setField(term60979, term60979.getClass(), "skin_name_ary", "LYRdIFgbgt");
        setField(term60979, term60979.getClass(), "skin_illust_ary", "NiKeRXajei");
        setField(term60979, term60979.getClass(), "skin_desc_ary", "fDNtdfDzQh");
        setIntField(term60979, term60979.getClass(), "pdddt_flg", -673413879);
        setIntField(term61175, term61175.getClass(), "year", 2024);
        setShortField(term61175, term61175.getClass(), "month", (short) 2);
        setShortField(term61175, term61175.getClass(), "day", (short) 5);
        setField(term61174, term61174.getClass(), "date", term61175);
        setByteField(term61179, term61179.getClass(), "hour", (byte) 12);
        setByteField(term61179, term61179.getClass(), "minute", (byte) 28);
        setByteField(term61179, term61179.getClass(), "second", (byte) 37);
        setIntField(term61179, term61179.getClass(), "nano", 689695229);
        setField(term61174, term61174.getClass(), "time", term61179);
        setField(term60979, term60979.getClass(), "pdddt_tm", term61174);
        setIntField(term60979, term60979.getClass(), "nblss_ltt_stts", 1609778442);
        setIntField(term60979, term60979.getClass(), "nblss_ltt_tckt", 524850421);
        setIntField(term60979, term60979.getClass(), "nblss_ltt_is_opn", -1833121756);
        setIntField(term60979, term60979.getClass(), "nblss_ltt_prz", -1493632787);
        setIntField(term60979, term60979.getClass(), "nblss_ltt_nxt_stts", -1056969264);
        setIntField(term60979, term60979.getClass(), "nblss_ltt_nxt_tckt", -709130701);
        setField(term60979, term60979.getClass(), "my_qst_id", "VbIydgisyZ");
        setField(term60979, term60979.getClass(), "my_qst_r_qid", "vigaMWRpCA");
        setField(term60979, term60979.getClass(), "my_qst_r_knd", "sgVVVUpnau");
        setField(term60979, term60979.getClass(), "my_qst_r_vl", "xwVTgDhNdW");
        setField(term60979, term60979.getClass(), "my_qst_r_nflg", "ruqGjVRVlD");
        setField(term60979, term60979.getClass(), "my_ccd_r_qid", "oeoFYkQLVk");
        setField(term60979, term60979.getClass(), "my_ccd_r_hnd", "fibZqjUmdU");
        setField(term60979, term60979.getClass(), "my_ccd_r_vp", "DvLIPKnbCV");
        setField(term60979, term60979.getClass(), "cmd", "QwAMZyCIhS");
        setField(term60979, term60979.getClass(), "req_id", "TnLDXZoBoo");
        setField(term60979, term60979.getClass(), "stat", "RQTElJrtwb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hFvoVHxToy";
        callMethod(klass, "setMy_ccd_r_qid", argTypes, term60979, args);
    }

};


