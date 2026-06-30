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

public class ProfileResp_setPoint_105027589630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97646;
     Object term97685;

    public ProfileResp_setPoint_105027589630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97646 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97646, term97646.getClass(), "userName", "QreFiHgQtA");
        setIntField(term97646, term97646.getClass(), "level", -909529918);
        setLongField(term97646, term97646.getClass(), "exp", -6395819075543256253L);
        setLongField(term97646, term97646.getClass(), "point", 602378389007009384L);
        setLongField(term97646, term97646.getClass(), "totalPoint", 8795215889386814509L);
        setIntField(term97646, term97646.getClass(), "playCount", -1380674874);
        setIntField(term97646, term97646.getClass(), "jewelCount", 357286605);
        setIntField(term97646, term97646.getClass(), "totalJewelCount", -46967798);
        setIntField(term97646, term97646.getClass(), "playerRating", -192256699);
        setIntField(term97646, term97646.getClass(), "highestRating", 738184428);
        setIntField(term97646, term97646.getClass(), "battlePoint", 742693469);
        setIntField(term97646, term97646.getClass(), "nameplateId", -680799146);
        setIntField(term97646, term97646.getClass(), "trophyId", -624130052);
        setIntField(term97646, term97646.getClass(), "cardId", 1393208863);
        setIntField(term97646, term97646.getClass(), "characterId", -1178534678);
        setLongField(term97646, term97646.getClass(), "sumTechHighScore", 430277502384927919L);
        setLongField(term97646, term97646.getClass(), "sumTechBasicHighScore", 7423027171807616966L);
        setLongField(term97646, term97646.getClass(), "sumTechAdvancedHighScore", 6047481739665997842L);
        setLongField(term97646, term97646.getClass(), "sumTechExpertHighScore", 7491380885779551380L);
        setLongField(term97646, term97646.getClass(), "sumTechMasterHighScore", -6075003324338438713L);
        setLongField(term97646, term97646.getClass(), "sumTechLunaticHighScore", 434718662053495122L);
        setLongField(term97646, term97646.getClass(), "sumBattleHighScore", 8536850335249737672L);
        setLongField(term97646, term97646.getClass(), "sumBattleBasicHighScore", -6246736132402863594L);
        setLongField(term97646, term97646.getClass(), "sumBattleAdvancedHighScore", 1041198836874363024L);
        setLongField(term97646, term97646.getClass(), "sumBattleExpertHighScore", 953055836500237237L);
        setLongField(term97646, term97646.getClass(), "sumBattleMasterHighScore", -2489440598226882778L);
        setLongField(term97646, term97646.getClass(), "sumBattleLunaticHighScore", 2178302950009102694L);
        term97685 = new Long(-6959816049126516902L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term97685;
        callMethod(klass, "setPoint", argTypes, term97646, args);
    }

};


