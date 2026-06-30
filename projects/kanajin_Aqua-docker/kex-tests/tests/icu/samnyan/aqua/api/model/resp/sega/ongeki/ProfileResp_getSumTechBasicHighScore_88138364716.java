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

public class ProfileResp_getSumTechBasicHighScore_88138364716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96934;

    public ProfileResp_getSumTechBasicHighScore_88138364716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96934 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96934, term96934.getClass(), "userName", "firRatwwsv");
        setIntField(term96934, term96934.getClass(), "level", 245501273);
        setLongField(term96934, term96934.getClass(), "exp", 5744771612927945158L);
        setLongField(term96934, term96934.getClass(), "point", 9060109026753038742L);
        setLongField(term96934, term96934.getClass(), "totalPoint", 6241619707576176809L);
        setIntField(term96934, term96934.getClass(), "playCount", 1850398879);
        setIntField(term96934, term96934.getClass(), "jewelCount", -1693848904);
        setIntField(term96934, term96934.getClass(), "totalJewelCount", -1177143745);
        setIntField(term96934, term96934.getClass(), "playerRating", 866628204);
        setIntField(term96934, term96934.getClass(), "highestRating", -99630559);
        setIntField(term96934, term96934.getClass(), "battlePoint", 515466129);
        setIntField(term96934, term96934.getClass(), "nameplateId", 1958878266);
        setIntField(term96934, term96934.getClass(), "trophyId", 1300734439);
        setIntField(term96934, term96934.getClass(), "cardId", 804625707);
        setIntField(term96934, term96934.getClass(), "characterId", 253792982);
        setLongField(term96934, term96934.getClass(), "sumTechHighScore", 4953585455715516972L);
        setLongField(term96934, term96934.getClass(), "sumTechBasicHighScore", -1117078534769352716L);
        setLongField(term96934, term96934.getClass(), "sumTechAdvancedHighScore", -3556477439377377607L);
        setLongField(term96934, term96934.getClass(), "sumTechExpertHighScore", -2888976981013426911L);
        setLongField(term96934, term96934.getClass(), "sumTechMasterHighScore", -3841393745504397353L);
        setLongField(term96934, term96934.getClass(), "sumTechLunaticHighScore", 3440605481200518402L);
        setLongField(term96934, term96934.getClass(), "sumBattleHighScore", 5153511211529927634L);
        setLongField(term96934, term96934.getClass(), "sumBattleBasicHighScore", 5936043033481765124L);
        setLongField(term96934, term96934.getClass(), "sumBattleAdvancedHighScore", -4021882870461833333L);
        setLongField(term96934, term96934.getClass(), "sumBattleExpertHighScore", -6927359252849693512L);
        setLongField(term96934, term96934.getClass(), "sumBattleMasterHighScore", -4885312547111808609L);
        setLongField(term96934, term96934.getClass(), "sumBattleLunaticHighScore", 3688228847736962959L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechBasicHighScore", argTypes, term96934, args);
    }

};


