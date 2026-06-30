package icu.samnyan.aqua.sega.diva.model.response.card;

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
import static icu.samnyan.aqua.sega.diva.model.response.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CardProcedureResponse_setLvstr_184869603647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19365;

    public CardProcedureResponse_setLvstr_184869603647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19365 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term19365, term19365.getClass(), "cd_adm_result", null);
        setIntField(term19365, term19365.getClass(), "chg_name_price", 0);
        setIntField(term19365, term19365.getClass(), "accept_idx", 0);
        setIntField(term19365, term19365.getClass(), "pd_id", 0);
        setField(term19365, term19365.getClass(), "player_name", null);
        setField(term19365, term19365.getClass(), "lv_num", null);
        setField(term19365, term19365.getClass(), "lv_pnt", null);
        setField(term19365, term19365.getClass(), "lv_str", null);
        setField(term19365, term19365.getClass(), "lv_efct_id", null);
        setField(term19365, term19365.getClass(), "lv_plt_id", null);
        setField(term19365, term19365.getClass(), "vcld_pts", null);
        setField(term19365, term19365.getClass(), "passwd_stat", null);
        setField(term19365, term19365.getClass(), "cmd", null);
        setField(term19365, term19365.getClass(), "req_id", null);
        setField(term19365, term19365.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLv_str", argTypes, term19365, args);
    }

};


