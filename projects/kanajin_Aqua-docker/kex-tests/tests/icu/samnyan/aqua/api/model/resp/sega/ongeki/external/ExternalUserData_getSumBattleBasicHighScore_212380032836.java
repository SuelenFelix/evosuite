package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getSumBattleBasicHighScore_212380032836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3178480;

    public ExternalUserData_getSumBattleBasicHighScore_212380032836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3178480 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3178480, term3178480.getClass(), "accessCode", "UTakTlIZvp");
        setField(term3178480, term3178480.getClass(), "userName", "SNpiVYZloo");
        setIntField(term3178480, term3178480.getClass(), "level", 1142304767);
        setIntField(term3178480, term3178480.getClass(), "reincarnationNum", -1240926661);
        setLongField(term3178480, term3178480.getClass(), "exp", 3130468896631741478L);
        setLongField(term3178480, term3178480.getClass(), "point", -4528981595125210766L);
        setLongField(term3178480, term3178480.getClass(), "totalPoint", 5724348276302429362L);
        setIntField(term3178480, term3178480.getClass(), "playCount", 177485129);
        setIntField(term3178480, term3178480.getClass(), "jewelCount", 1248161842);
        setIntField(term3178480, term3178480.getClass(), "totalJewelCount", -446723751);
        setIntField(term3178480, term3178480.getClass(), "medalCount", 2036774997);
        setIntField(term3178480, term3178480.getClass(), "playerRating", -50642752);
        setIntField(term3178480, term3178480.getClass(), "highestRating", 1255719709);
        setIntField(term3178480, term3178480.getClass(), "battlePoint", 989201779);
        setIntField(term3178480, term3178480.getClass(), "bestBattlePoint", 58209695);
        setIntField(term3178480, term3178480.getClass(), "overDamageBattlePoint", 1472850583);
        setIntField(term3178480, term3178480.getClass(), "nameplateId", 1812445316);
        setIntField(term3178480, term3178480.getClass(), "trophyId", 195872420);
        setIntField(term3178480, term3178480.getClass(), "cardId", 861461178);
        setIntField(term3178480, term3178480.getClass(), "characterId", 94775331);
        setIntField(term3178480, term3178480.getClass(), "tabSetting", 1723311114);
        setIntField(term3178480, term3178480.getClass(), "tabSortSetting", -1063496764);
        setIntField(term3178480, term3178480.getClass(), "cardCategorySetting", 865068347);
        setIntField(term3178480, term3178480.getClass(), "cardSortSetting", 2071019177);
        setIntField(term3178480, term3178480.getClass(), "rivalScoreCategorySetting", -435674516);
        setIntField(term3178480, term3178480.getClass(), "playedTutorialBit", -605538796);
        setIntField(term3178480, term3178480.getClass(), "firstTutorialCancelNum", -566266429);
        setLongField(term3178480, term3178480.getClass(), "sumTechHighScore", 4927564606474788309L);
        setLongField(term3178480, term3178480.getClass(), "sumTechBasicHighScore", 5504207881256961798L);
        setLongField(term3178480, term3178480.getClass(), "sumTechAdvancedHighScore", 557836067376735451L);
        setLongField(term3178480, term3178480.getClass(), "sumTechExpertHighScore", -3643543167796502782L);
        setLongField(term3178480, term3178480.getClass(), "sumTechMasterHighScore", 5806302744399837506L);
        setLongField(term3178480, term3178480.getClass(), "sumTechLunaticHighScore", 1635045082423714552L);
        setLongField(term3178480, term3178480.getClass(), "sumBattleHighScore", -6811330007444429948L);
        setLongField(term3178480, term3178480.getClass(), "sumBattleBasicHighScore", -3834622951489323961L);
        setLongField(term3178480, term3178480.getClass(), "sumBattleAdvancedHighScore", -668755453531755244L);
        setLongField(term3178480, term3178480.getClass(), "sumBattleExpertHighScore", -1922555355922360759L);
        setLongField(term3178480, term3178480.getClass(), "sumBattleMasterHighScore", -981668298189796376L);
        setLongField(term3178480, term3178480.getClass(), "sumBattleLunaticHighScore", 1510120501350621038L);
        setField(term3178480, term3178480.getClass(), "eventWatchedDate", "ItrKEsRZGd");
        setField(term3178480, term3178480.getClass(), "cmEventWatchedDate", "hXSstskeMe");
        setField(term3178480, term3178480.getClass(), "firstGameId", "ycCQbbmDOE");
        setField(term3178480, term3178480.getClass(), "firstRomVersion", "liAKSmslSq");
        setField(term3178480, term3178480.getClass(), "firstDataVersion", "RnoKnOViSV");
        setField(term3178480, term3178480.getClass(), "firstPlayDate", "LuVTthLOpa");
        setField(term3178480, term3178480.getClass(), "lastGameId", "guhFujDjLd");
        setField(term3178480, term3178480.getClass(), "lastRomVersion", "zUrhfyARaK");
        setField(term3178480, term3178480.getClass(), "lastDataVersion", "GAykIVGppc");
        setField(term3178480, term3178480.getClass(), "compatibleCmVersion", "sBgXMvJWFE");
        setField(term3178480, term3178480.getClass(), "lastPlayDate", "HFsPfXEUPU");
        setIntField(term3178480, term3178480.getClass(), "lastPlaceId", -1392480804);
        setField(term3178480, term3178480.getClass(), "lastPlaceName", "VpQJhdzRZY");
        setIntField(term3178480, term3178480.getClass(), "lastRegionId", 1291209648);
        setField(term3178480, term3178480.getClass(), "lastRegionName", "CkYjEaDyui");
        setIntField(term3178480, term3178480.getClass(), "lastAllNetId", 1353060698);
        setField(term3178480, term3178480.getClass(), "lastClientId", "FamVCgGWPz");
        setIntField(term3178480, term3178480.getClass(), "lastUsedDeckId", 1131032396);
        setIntField(term3178480, term3178480.getClass(), "lastPlayMusicLevel", 2136424100);
        setIntField(term3178480, term3178480.getClass(), "lastEmoneyBrand", 1352946845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleBasicHighScore", argTypes, term3178480, args);
    }

};


