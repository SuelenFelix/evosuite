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

public class CardProcedureResponse_setPlayername_12834433344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19353;

    public CardProcedureResponse_setPlayername_12834433344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19353 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term19353, term19353.getClass(), "cd_adm_result", null);
        setIntField(term19353, term19353.getClass(), "chg_name_price", 0);
        setIntField(term19353, term19353.getClass(), "accept_idx", 0);
        setIntField(term19353, term19353.getClass(), "pd_id", 0);
        setField(term19353, term19353.getClass(), "player_name", null);
        setField(term19353, term19353.getClass(), "lv_num", null);
        setField(term19353, term19353.getClass(), "lv_pnt", null);
        setField(term19353, term19353.getClass(), "lv_str", null);
        setField(term19353, term19353.getClass(), "lv_efct_id", null);
        setField(term19353, term19353.getClass(), "lv_plt_id", null);
        setField(term19353, term19353.getClass(), "vcld_pts", null);
        setField(term19353, term19353.getClass(), "passwd_stat", null);
        setField(term19353, term19353.getClass(), "cmd", null);
        setField(term19353, term19353.getClass(), "req_id", null);
        setField(term19353, term19353.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayer_name", argTypes, term19353, args);
    }

};


