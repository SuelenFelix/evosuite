package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserBoss_isClear_10866205945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135866;

    public UserBoss_isClear_10866205945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term135872 = new Long(7017605765544766728L);
        term135866 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term135868 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term135870 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term135886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135891 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135901 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term135866, term135866.getClass(), "id", -6446923971345899778L);
        setLongField(term135868, term135868.getClass(), "id", 362875572133549364L);
        setLongField(term135870, term135870.getClass(), "id", 6569877711556978083L);
        setField(term135870, term135870.getClass(), "extId", term135872);
        setField(term135870, term135870.getClass(), "luid", "IyfKbexwMT");
        setIntField(term135887, term135887.getClass(), "year", 2013);
        setShortField(term135887, term135887.getClass(), "month", (short) 4);
        setShortField(term135887, term135887.getClass(), "day", (short) 26);
        setField(term135886, term135886.getClass(), "date", term135887);
        setByteField(term135891, term135891.getClass(), "hour", (byte) 11);
        setByteField(term135891, term135891.getClass(), "minute", (byte) 7);
        setByteField(term135891, term135891.getClass(), "second", (byte) 42);
        setIntField(term135891, term135891.getClass(), "nano", 202198585);
        setField(term135886, term135886.getClass(), "time", term135891);
        setField(term135870, term135870.getClass(), "registerTime", term135886);
        setIntField(term135897, term135897.getClass(), "year", 2010);
        setShortField(term135897, term135897.getClass(), "month", (short) 1);
        setShortField(term135897, term135897.getClass(), "day", (short) 11);
        setField(term135896, term135896.getClass(), "date", term135897);
        setByteField(term135901, term135901.getClass(), "hour", (byte) 23);
        setByteField(term135901, term135901.getClass(), "minute", (byte) 36);
        setByteField(term135901, term135901.getClass(), "second", (byte) 37);
        setIntField(term135901, term135901.getClass(), "nano", 947768655);
        setField(term135896, term135896.getClass(), "time", term135901);
        setField(term135870, term135870.getClass(), "accessTime", term135896);
        setField(term135868, term135868.getClass(), "card", term135870);
        setField(term135868, term135868.getClass(), "userName", "rqqFczqbjO");
        setIntField(term135868, term135868.getClass(), "level", -203097399);
        setIntField(term135868, term135868.getClass(), "reincarnationNum", 620198648);
        setLongField(term135868, term135868.getClass(), "exp", 2732735992749496148L);
        setLongField(term135868, term135868.getClass(), "point", -9121553402002580616L);
        setLongField(term135868, term135868.getClass(), "totalPoint", 8475273178976249774L);
        setIntField(term135868, term135868.getClass(), "playCount", 1593407362);
        setIntField(term135868, term135868.getClass(), "jewelCount", 689506008);
        setIntField(term135868, term135868.getClass(), "totalJewelCount", 580048439);
        setIntField(term135868, term135868.getClass(), "medalCount", 534108526);
        setIntField(term135868, term135868.getClass(), "playerRating", -1525906157);
        setIntField(term135868, term135868.getClass(), "highestRating", -747827797);
        setIntField(term135868, term135868.getClass(), "battlePoint", -88552248);
        setIntField(term135868, term135868.getClass(), "bestBattlePoint", 835835802);
        setIntField(term135868, term135868.getClass(), "overDamageBattlePoint", 148923410);
        setBooleanField(term135868, term135868.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term135868, term135868.getClass(), "nameplateId", 892350142);
        setIntField(term135868, term135868.getClass(), "trophyId", 97847948);
        setIntField(term135868, term135868.getClass(), "cardId", -2100667414);
        setIntField(term135868, term135868.getClass(), "characterId", -1770304070);
        setIntField(term135868, term135868.getClass(), "characterVoiceNo", -2146519194);
        setIntField(term135868, term135868.getClass(), "tabSetting", 314235257);
        setIntField(term135868, term135868.getClass(), "tabSortSetting", -1266948778);
        setIntField(term135868, term135868.getClass(), "cardCategorySetting", 944749878);
        setIntField(term135868, term135868.getClass(), "cardSortSetting", 1040572866);
        setIntField(term135868, term135868.getClass(), "rivalScoreCategorySetting", 206565778);
        setIntField(term135868, term135868.getClass(), "playedTutorialBit", -2142502223);
        setIntField(term135868, term135868.getClass(), "firstTutorialCancelNum", -1920747929);
        setLongField(term135868, term135868.getClass(), "sumTechHighScore", 8141471458567667131L);
        setLongField(term135868, term135868.getClass(), "sumTechBasicHighScore", 5319309130635680245L);
        setLongField(term135868, term135868.getClass(), "sumTechAdvancedHighScore", 7971443840902800438L);
        setLongField(term135868, term135868.getClass(), "sumTechExpertHighScore", 4239771977554725649L);
        setLongField(term135868, term135868.getClass(), "sumTechMasterHighScore", -8062984155747993697L);
        setLongField(term135868, term135868.getClass(), "sumTechLunaticHighScore", 4335178652895975458L);
        setLongField(term135868, term135868.getClass(), "sumBattleHighScore", -2460872546777929150L);
        setLongField(term135868, term135868.getClass(), "sumBattleBasicHighScore", -563695678612995645L);
        setLongField(term135868, term135868.getClass(), "sumBattleAdvancedHighScore", 6016371554243729117L);
        setLongField(term135868, term135868.getClass(), "sumBattleExpertHighScore", -9136317165344899182L);
        setLongField(term135868, term135868.getClass(), "sumBattleMasterHighScore", -6149545841471051318L);
        setLongField(term135868, term135868.getClass(), "sumBattleLunaticHighScore", -7879611281872156688L);
        setField(term135868, term135868.getClass(), "eventWatchedDate", "fhhYQGiExU");
        setField(term135868, term135868.getClass(), "cmEventWatchedDate", "poqEkIMUQX");
        setField(term135868, term135868.getClass(), "firstGameId", "SLVaFTiZJu");
        setField(term135868, term135868.getClass(), "firstRomVersion", "BFwLWMcFzQ");
        setField(term135868, term135868.getClass(), "firstDataVersion", "ueMjdaYJqr");
        setField(term135868, term135868.getClass(), "firstPlayDate", "IkmVfYlXcX");
        setField(term135868, term135868.getClass(), "lastGameId", "WIAcrtkMRk");
        setField(term135868, term135868.getClass(), "lastRomVersion", "HulasQmWEg");
        setField(term135868, term135868.getClass(), "lastDataVersion", "DYfBwepDla");
        setField(term135868, term135868.getClass(), "compatibleCmVersion", "cxjGlUIOFS");
        setField(term135868, term135868.getClass(), "lastPlayDate", "uXFGrCmsoj");
        setIntField(term135868, term135868.getClass(), "lastPlaceId", -872346063);
        setField(term135868, term135868.getClass(), "lastPlaceName", "neFbgoRFth");
        setIntField(term135868, term135868.getClass(), "lastRegionId", -15980730);
        setField(term135868, term135868.getClass(), "lastRegionName", "rMAeMXcVLg");
        setIntField(term135868, term135868.getClass(), "lastAllNetId", 1099197250);
        setField(term135868, term135868.getClass(), "lastClientId", "rwfffztPZR");
        setIntField(term135868, term135868.getClass(), "lastUsedDeckId", -576768796);
        setIntField(term135868, term135868.getClass(), "lastPlayMusicLevel", -1567842300);
        setIntField(term135868, term135868.getClass(), "lastEmoneyBrand", 1297816597);
        setField(term135866, term135866.getClass(), "user", term135868);
        setIntField(term135866, term135866.getClass(), "musicId", 382635155);
        setIntField(term135866, term135866.getClass(), "damage", -217839806);
        setBooleanField(term135866, term135866.getClass(), "isClear", true);
        setIntField(term135866, term135866.getClass(), "eventId", 613249396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term135866, args);
    }

};


