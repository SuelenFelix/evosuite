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
import java.lang.Long;

public class ProfileResp_setSumTechLunaticHighScore_104295453547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98513;
     Object term98552;

    public ProfileResp_setSumTechLunaticHighScore_104295453547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98513 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98513, term98513.getClass(), "userName", "EOTzpwdFZX");
        setIntField(term98513, term98513.getClass(), "level", 486541242);
        setLongField(term98513, term98513.getClass(), "exp", 8089248698485794254L);
        setLongField(term98513, term98513.getClass(), "point", 3711721846786904409L);
        setLongField(term98513, term98513.getClass(), "totalPoint", 5224036234170448136L);
        setIntField(term98513, term98513.getClass(), "playCount", -437318670);
        setIntField(term98513, term98513.getClass(), "jewelCount", -1828747994);
        setIntField(term98513, term98513.getClass(), "totalJewelCount", 848418672);
        setIntField(term98513, term98513.getClass(), "playerRating", -699063940);
        setIntField(term98513, term98513.getClass(), "highestRating", -1534836282);
        setIntField(term98513, term98513.getClass(), "battlePoint", -615320596);
        setIntField(term98513, term98513.getClass(), "nameplateId", 1009353606);
        setIntField(term98513, term98513.getClass(), "trophyId", 2119724919);
        setIntField(term98513, term98513.getClass(), "cardId", -270619364);
        setIntField(term98513, term98513.getClass(), "characterId", -2129714346);
        setLongField(term98513, term98513.getClass(), "sumTechHighScore", -2746894021637841534L);
        setLongField(term98513, term98513.getClass(), "sumTechBasicHighScore", -4811828139614324758L);
        setLongField(term98513, term98513.getClass(), "sumTechAdvancedHighScore", 492526995924434406L);
        setLongField(term98513, term98513.getClass(), "sumTechExpertHighScore", 3040101547176632170L);
        setLongField(term98513, term98513.getClass(), "sumTechMasterHighScore", 6480286252341526185L);
        setLongField(term98513, term98513.getClass(), "sumTechLunaticHighScore", 6928955122811296988L);
        setLongField(term98513, term98513.getClass(), "sumBattleHighScore", 5801350595640941244L);
        setLongField(term98513, term98513.getClass(), "sumBattleBasicHighScore", -5319750845600888353L);
        setLongField(term98513, term98513.getClass(), "sumBattleAdvancedHighScore", -6913119769739168671L);
        setLongField(term98513, term98513.getClass(), "sumBattleExpertHighScore", -2781730112585252230L);
        setLongField(term98513, term98513.getClass(), "sumBattleMasterHighScore", 7012532433376252398L);
        setLongField(term98513, term98513.getClass(), "sumBattleLunaticHighScore", 7641445067975604609L);
        term98552 = new Long(4515464480812491472L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98552;
        callMethod(klass, "setSumTechLunaticHighScore", argTypes, term98513, args);
    }

};


