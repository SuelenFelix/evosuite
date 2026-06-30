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

public class ProfileResp_getUserName_18189677810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96150;

    public ProfileResp_getUserName_18189677810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96150 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96150, term96150.getClass(), "userName", "PDVPadksDo");
        setIntField(term96150, term96150.getClass(), "level", 740476798);
        setLongField(term96150, term96150.getClass(), "exp", -4978418078043618001L);
        setLongField(term96150, term96150.getClass(), "point", -7292482330192280029L);
        setLongField(term96150, term96150.getClass(), "totalPoint", -3721505474796343685L);
        setIntField(term96150, term96150.getClass(), "playCount", -1381569754);
        setIntField(term96150, term96150.getClass(), "jewelCount", 1159651573);
        setIntField(term96150, term96150.getClass(), "totalJewelCount", -385766128);
        setIntField(term96150, term96150.getClass(), "playerRating", 1509488338);
        setIntField(term96150, term96150.getClass(), "highestRating", 536817677);
        setIntField(term96150, term96150.getClass(), "battlePoint", 839024512);
        setIntField(term96150, term96150.getClass(), "nameplateId", 612589038);
        setIntField(term96150, term96150.getClass(), "trophyId", -2034946083);
        setIntField(term96150, term96150.getClass(), "cardId", -143359107);
        setIntField(term96150, term96150.getClass(), "characterId", -1823058558);
        setLongField(term96150, term96150.getClass(), "sumTechHighScore", 5245944844954048799L);
        setLongField(term96150, term96150.getClass(), "sumTechBasicHighScore", -8491465990571387854L);
        setLongField(term96150, term96150.getClass(), "sumTechAdvancedHighScore", -8015465580603278182L);
        setLongField(term96150, term96150.getClass(), "sumTechExpertHighScore", 9116493323584984288L);
        setLongField(term96150, term96150.getClass(), "sumTechMasterHighScore", -3215449192440238703L);
        setLongField(term96150, term96150.getClass(), "sumTechLunaticHighScore", -4663989259702352502L);
        setLongField(term96150, term96150.getClass(), "sumBattleHighScore", -6787604392570260783L);
        setLongField(term96150, term96150.getClass(), "sumBattleBasicHighScore", -1161713320438974225L);
        setLongField(term96150, term96150.getClass(), "sumBattleAdvancedHighScore", -1861824160148815906L);
        setLongField(term96150, term96150.getClass(), "sumBattleExpertHighScore", 6984072138346084111L);
        setLongField(term96150, term96150.getClass(), "sumBattleMasterHighScore", 8121720627030450709L);
        setLongField(term96150, term96150.getClass(), "sumBattleLunaticHighScore", -8883119307583837968L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term96150, args);
    }

};


