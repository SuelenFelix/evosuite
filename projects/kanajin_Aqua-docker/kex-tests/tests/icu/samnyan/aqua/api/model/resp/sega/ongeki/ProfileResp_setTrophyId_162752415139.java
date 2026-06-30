package icu.samnyan.aqua.api.model.resp.sega.ongeki;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ProfileResp_setTrophyId_162752415139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98105;
     Object term98144;

    public ProfileResp_setTrophyId_162752415139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98105 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98105, term98105.getClass(), "userName", "chSGxkbeAc");
        setIntField(term98105, term98105.getClass(), "level", -903346718);
        setLongField(term98105, term98105.getClass(), "exp", -4433155151923052669L);
        setLongField(term98105, term98105.getClass(), "point", -7954999924936224754L);
        setLongField(term98105, term98105.getClass(), "totalPoint", 4857187962580249593L);
        setIntField(term98105, term98105.getClass(), "playCount", -1151949200);
        setIntField(term98105, term98105.getClass(), "jewelCount", 1790267210);
        setIntField(term98105, term98105.getClass(), "totalJewelCount", 153692829);
        setIntField(term98105, term98105.getClass(), "playerRating", -1991176715);
        setIntField(term98105, term98105.getClass(), "highestRating", -1614536563);
        setIntField(term98105, term98105.getClass(), "battlePoint", -931749414);
        setIntField(term98105, term98105.getClass(), "nameplateId", -1593630706);
        setIntField(term98105, term98105.getClass(), "trophyId", -2003814210);
        setIntField(term98105, term98105.getClass(), "cardId", -135664106);
        setIntField(term98105, term98105.getClass(), "characterId", 494405538);
        setLongField(term98105, term98105.getClass(), "sumTechHighScore", 6757940015527142269L);
        setLongField(term98105, term98105.getClass(), "sumTechBasicHighScore", 690252317501985157L);
        setLongField(term98105, term98105.getClass(), "sumTechAdvancedHighScore", -8602184519057287697L);
        setLongField(term98105, term98105.getClass(), "sumTechExpertHighScore", -8387724928136585335L);
        setLongField(term98105, term98105.getClass(), "sumTechMasterHighScore", 1746984970241024752L);
        setLongField(term98105, term98105.getClass(), "sumTechLunaticHighScore", 6448299170686403509L);
        setLongField(term98105, term98105.getClass(), "sumBattleHighScore", -6284262807090006153L);
        setLongField(term98105, term98105.getClass(), "sumBattleBasicHighScore", -8541828392812849455L);
        setLongField(term98105, term98105.getClass(), "sumBattleAdvancedHighScore", -7061251528107788725L);
        setLongField(term98105, term98105.getClass(), "sumBattleExpertHighScore", -6167044481159278152L);
        setLongField(term98105, term98105.getClass(), "sumBattleMasterHighScore", 7057956815200870049L);
        setLongField(term98105, term98105.getClass(), "sumBattleLunaticHighScore", -2696998534333526361L);
        term98144 = new Integer(-253238969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term98144;
        callMethod(klass, "setTrophyId", argTypes, term98105, args);
    }

};


