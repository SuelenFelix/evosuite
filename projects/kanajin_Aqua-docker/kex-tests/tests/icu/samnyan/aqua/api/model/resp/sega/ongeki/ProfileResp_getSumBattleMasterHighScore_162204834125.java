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

public class ProfileResp_getSumBattleMasterHighScore_162204834125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97375;

    public ProfileResp_getSumBattleMasterHighScore_162204834125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97375 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97375, term97375.getClass(), "userName", "MxjPynRJZL");
        setIntField(term97375, term97375.getClass(), "level", -300217955);
        setLongField(term97375, term97375.getClass(), "exp", 2804974107412429674L);
        setLongField(term97375, term97375.getClass(), "point", -5429028487043252674L);
        setLongField(term97375, term97375.getClass(), "totalPoint", -8734878147587574374L);
        setIntField(term97375, term97375.getClass(), "playCount", 2139457985);
        setIntField(term97375, term97375.getClass(), "jewelCount", 107002946);
        setIntField(term97375, term97375.getClass(), "totalJewelCount", -1113912369);
        setIntField(term97375, term97375.getClass(), "playerRating", 867611719);
        setIntField(term97375, term97375.getClass(), "highestRating", -1891321464);
        setIntField(term97375, term97375.getClass(), "battlePoint", 205672918);
        setIntField(term97375, term97375.getClass(), "nameplateId", -45954550);
        setIntField(term97375, term97375.getClass(), "trophyId", 323639146);
        setIntField(term97375, term97375.getClass(), "cardId", 1265503275);
        setIntField(term97375, term97375.getClass(), "characterId", 390433469);
        setLongField(term97375, term97375.getClass(), "sumTechHighScore", 6886333193902557349L);
        setLongField(term97375, term97375.getClass(), "sumTechBasicHighScore", 5886312546789802954L);
        setLongField(term97375, term97375.getClass(), "sumTechAdvancedHighScore", 220207956758911845L);
        setLongField(term97375, term97375.getClass(), "sumTechExpertHighScore", -594995129493039195L);
        setLongField(term97375, term97375.getClass(), "sumTechMasterHighScore", -1527013582515384446L);
        setLongField(term97375, term97375.getClass(), "sumTechLunaticHighScore", 3500242375717703414L);
        setLongField(term97375, term97375.getClass(), "sumBattleHighScore", -1021404098416409370L);
        setLongField(term97375, term97375.getClass(), "sumBattleBasicHighScore", 7719008326819245899L);
        setLongField(term97375, term97375.getClass(), "sumBattleAdvancedHighScore", -3431503640917606232L);
        setLongField(term97375, term97375.getClass(), "sumBattleExpertHighScore", 3694672349594925013L);
        setLongField(term97375, term97375.getClass(), "sumBattleMasterHighScore", 288749861746273170L);
        setLongField(term97375, term97375.getClass(), "sumBattleLunaticHighScore", -6444870215267340910L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleMasterHighScore", argTypes, term97375, args);
    }

};


