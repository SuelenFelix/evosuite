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

public class ProfileResp_canEqual_7098354555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98920;
     Object term98959;

    public ProfileResp_canEqual_7098354555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98920 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98920, term98920.getClass(), "userName", "RvgGcARkbA");
        setIntField(term98920, term98920.getClass(), "level", 936436638);
        setLongField(term98920, term98920.getClass(), "exp", -3134609510921007024L);
        setLongField(term98920, term98920.getClass(), "point", 7369890448384182401L);
        setLongField(term98920, term98920.getClass(), "totalPoint", 8347323031636290088L);
        setIntField(term98920, term98920.getClass(), "playCount", -1900716134);
        setIntField(term98920, term98920.getClass(), "jewelCount", -1145856499);
        setIntField(term98920, term98920.getClass(), "totalJewelCount", 869841693);
        setIntField(term98920, term98920.getClass(), "playerRating", -1643218641);
        setIntField(term98920, term98920.getClass(), "highestRating", 23752784);
        setIntField(term98920, term98920.getClass(), "battlePoint", -2117175249);
        setIntField(term98920, term98920.getClass(), "nameplateId", -611759224);
        setIntField(term98920, term98920.getClass(), "trophyId", 191855540);
        setIntField(term98920, term98920.getClass(), "cardId", -812014967);
        setIntField(term98920, term98920.getClass(), "characterId", -1166630546);
        setLongField(term98920, term98920.getClass(), "sumTechHighScore", -8657409081910158759L);
        setLongField(term98920, term98920.getClass(), "sumTechBasicHighScore", 1184786260704907718L);
        setLongField(term98920, term98920.getClass(), "sumTechAdvancedHighScore", 3286449977075100074L);
        setLongField(term98920, term98920.getClass(), "sumTechExpertHighScore", 5975353931369383511L);
        setLongField(term98920, term98920.getClass(), "sumTechMasterHighScore", -534239435021672582L);
        setLongField(term98920, term98920.getClass(), "sumTechLunaticHighScore", 5255853078398502544L);
        setLongField(term98920, term98920.getClass(), "sumBattleHighScore", 2738829194305734189L);
        setLongField(term98920, term98920.getClass(), "sumBattleBasicHighScore", -8096980405317281549L);
        setLongField(term98920, term98920.getClass(), "sumBattleAdvancedHighScore", 5938062867488101746L);
        setLongField(term98920, term98920.getClass(), "sumBattleExpertHighScore", 1358556891212092497L);
        setLongField(term98920, term98920.getClass(), "sumBattleMasterHighScore", 2197622562977519712L);
        setLongField(term98920, term98920.getClass(), "sumBattleLunaticHighScore", 2294215595274775695L);
        term98959 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term98959;
        callMethod(klass, "canEqual", argTypes, term98920, args);
    }

};


