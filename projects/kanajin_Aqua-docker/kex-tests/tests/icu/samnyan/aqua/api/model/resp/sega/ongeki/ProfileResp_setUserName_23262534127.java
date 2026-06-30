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

public class ProfileResp_setUserName_23262534127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97473;

    public ProfileResp_setUserName_23262534127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97473 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97473, term97473.getClass(), "userName", "dLORHEiWhQ");
        setIntField(term97473, term97473.getClass(), "level", -1944769320);
        setLongField(term97473, term97473.getClass(), "exp", 5323883456740583519L);
        setLongField(term97473, term97473.getClass(), "point", -5292614708144298436L);
        setLongField(term97473, term97473.getClass(), "totalPoint", 5962096497172262429L);
        setIntField(term97473, term97473.getClass(), "playCount", -970188694);
        setIntField(term97473, term97473.getClass(), "jewelCount", 729053747);
        setIntField(term97473, term97473.getClass(), "totalJewelCount", -744662958);
        setIntField(term97473, term97473.getClass(), "playerRating", 1401885155);
        setIntField(term97473, term97473.getClass(), "highestRating", -1818779151);
        setIntField(term97473, term97473.getClass(), "battlePoint", 1069937822);
        setIntField(term97473, term97473.getClass(), "nameplateId", -1548174221);
        setIntField(term97473, term97473.getClass(), "trophyId", -1874803929);
        setIntField(term97473, term97473.getClass(), "cardId", -323062664);
        setIntField(term97473, term97473.getClass(), "characterId", -2144688678);
        setLongField(term97473, term97473.getClass(), "sumTechHighScore", 1987635967184493092L);
        setLongField(term97473, term97473.getClass(), "sumTechBasicHighScore", 4864144176037460244L);
        setLongField(term97473, term97473.getClass(), "sumTechAdvancedHighScore", -457660150580130067L);
        setLongField(term97473, term97473.getClass(), "sumTechExpertHighScore", 5137382071068804795L);
        setLongField(term97473, term97473.getClass(), "sumTechMasterHighScore", 670070327724971227L);
        setLongField(term97473, term97473.getClass(), "sumTechLunaticHighScore", 8534940695365868418L);
        setLongField(term97473, term97473.getClass(), "sumBattleHighScore", 6141950199644561235L);
        setLongField(term97473, term97473.getClass(), "sumBattleBasicHighScore", -6326228260050563017L);
        setLongField(term97473, term97473.getClass(), "sumBattleAdvancedHighScore", -6960859150814287131L);
        setLongField(term97473, term97473.getClass(), "sumBattleExpertHighScore", 3786521201412149676L);
        setLongField(term97473, term97473.getClass(), "sumBattleMasterHighScore", 6229800505568460683L);
        setLongField(term97473, term97473.getClass(), "sumBattleLunaticHighScore", -46966081812728169L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "beHKTyEsPG";
        callMethod(klass, "setUserName", argTypes, term97473, args);
    }

};


