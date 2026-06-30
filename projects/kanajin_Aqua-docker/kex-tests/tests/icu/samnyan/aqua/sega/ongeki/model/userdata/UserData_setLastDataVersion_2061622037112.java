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

public class UserData_setLastDataVersion_2061622037112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69618;

    public UserData_setLastDataVersion_2061622037112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term69622 = new Long(4266570509071948633L);
        term69618 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term69620 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term69636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69641 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69646 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69647 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69651 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term69618, term69618.getClass(), "id", -2991983062869407726L);
        setLongField(term69620, term69620.getClass(), "id", 7673299804150786709L);
        setField(term69620, term69620.getClass(), "extId", term69622);
        setField(term69620, term69620.getClass(), "luid", "fkBfmixBEh");
        setIntField(term69637, term69637.getClass(), "year", 2015);
        setShortField(term69637, term69637.getClass(), "month", (short) 4);
        setShortField(term69637, term69637.getClass(), "day", (short) 14);
        setField(term69636, term69636.getClass(), "date", term69637);
        setByteField(term69641, term69641.getClass(), "hour", (byte) 23);
        setByteField(term69641, term69641.getClass(), "minute", (byte) 8);
        setByteField(term69641, term69641.getClass(), "second", (byte) 53);
        setIntField(term69641, term69641.getClass(), "nano", 375234559);
        setField(term69636, term69636.getClass(), "time", term69641);
        setField(term69620, term69620.getClass(), "registerTime", term69636);
        setIntField(term69647, term69647.getClass(), "year", 2018);
        setShortField(term69647, term69647.getClass(), "month", (short) 1);
        setShortField(term69647, term69647.getClass(), "day", (short) 29);
        setField(term69646, term69646.getClass(), "date", term69647);
        setByteField(term69651, term69651.getClass(), "hour", (byte) 17);
        setByteField(term69651, term69651.getClass(), "minute", (byte) 5);
        setByteField(term69651, term69651.getClass(), "second", (byte) 53);
        setIntField(term69651, term69651.getClass(), "nano", 36624440);
        setField(term69646, term69646.getClass(), "time", term69651);
        setField(term69620, term69620.getClass(), "accessTime", term69646);
        setField(term69618, term69618.getClass(), "card", term69620);
        setField(term69618, term69618.getClass(), "userName", "SWbairdDKL");
        setIntField(term69618, term69618.getClass(), "level", 1676055742);
        setIntField(term69618, term69618.getClass(), "reincarnationNum", -963623987);
        setLongField(term69618, term69618.getClass(), "exp", -328975251976881527L);
        setLongField(term69618, term69618.getClass(), "point", -8205167487778854901L);
        setLongField(term69618, term69618.getClass(), "totalPoint", -2319494979451614999L);
        setIntField(term69618, term69618.getClass(), "playCount", 1184368914);
        setIntField(term69618, term69618.getClass(), "jewelCount", 138525382);
        setIntField(term69618, term69618.getClass(), "totalJewelCount", -1100331351);
        setIntField(term69618, term69618.getClass(), "medalCount", 1506966329);
        setIntField(term69618, term69618.getClass(), "playerRating", 38318819);
        setIntField(term69618, term69618.getClass(), "highestRating", 277037422);
        setIntField(term69618, term69618.getClass(), "battlePoint", -513227903);
        setIntField(term69618, term69618.getClass(), "bestBattlePoint", -1834509557);
        setIntField(term69618, term69618.getClass(), "overDamageBattlePoint", -1095760799);
        setBooleanField(term69618, term69618.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term69618, term69618.getClass(), "nameplateId", 964556409);
        setIntField(term69618, term69618.getClass(), "trophyId", 1651622020);
        setIntField(term69618, term69618.getClass(), "cardId", -1935395656);
        setIntField(term69618, term69618.getClass(), "characterId", -530623408);
        setIntField(term69618, term69618.getClass(), "characterVoiceNo", 1949662959);
        setIntField(term69618, term69618.getClass(), "tabSetting", 1639772797);
        setIntField(term69618, term69618.getClass(), "tabSortSetting", -228932741);
        setIntField(term69618, term69618.getClass(), "cardCategorySetting", -134006257);
        setIntField(term69618, term69618.getClass(), "cardSortSetting", 600590922);
        setIntField(term69618, term69618.getClass(), "rivalScoreCategorySetting", -215108807);
        setIntField(term69618, term69618.getClass(), "playedTutorialBit", 427775680);
        setIntField(term69618, term69618.getClass(), "firstTutorialCancelNum", -1797721552);
        setLongField(term69618, term69618.getClass(), "sumTechHighScore", 6416215056322758730L);
        setLongField(term69618, term69618.getClass(), "sumTechBasicHighScore", 2618923538778461059L);
        setLongField(term69618, term69618.getClass(), "sumTechAdvancedHighScore", 2716312107155781302L);
        setLongField(term69618, term69618.getClass(), "sumTechExpertHighScore", -7466718018690629580L);
        setLongField(term69618, term69618.getClass(), "sumTechMasterHighScore", -3911684619961278537L);
        setLongField(term69618, term69618.getClass(), "sumTechLunaticHighScore", 4841972609426972394L);
        setLongField(term69618, term69618.getClass(), "sumBattleHighScore", 7838223340532355808L);
        setLongField(term69618, term69618.getClass(), "sumBattleBasicHighScore", -5307334047022181786L);
        setLongField(term69618, term69618.getClass(), "sumBattleAdvancedHighScore", 1232868281434383187L);
        setLongField(term69618, term69618.getClass(), "sumBattleExpertHighScore", -4186453524994899646L);
        setLongField(term69618, term69618.getClass(), "sumBattleMasterHighScore", -4175021067374106014L);
        setLongField(term69618, term69618.getClass(), "sumBattleLunaticHighScore", 2657901217352946486L);
        setField(term69618, term69618.getClass(), "eventWatchedDate", "AibUFEALwF");
        setField(term69618, term69618.getClass(), "cmEventWatchedDate", "eXOUrXTrdW");
        setField(term69618, term69618.getClass(), "firstGameId", "aomDEETHep");
        setField(term69618, term69618.getClass(), "firstRomVersion", "GTMrlIYfIM");
        setField(term69618, term69618.getClass(), "firstDataVersion", "eiDqCOWbLE");
        setField(term69618, term69618.getClass(), "firstPlayDate", "OBbbsrFNxC");
        setField(term69618, term69618.getClass(), "lastGameId", "mvdZyohjrq");
        setField(term69618, term69618.getClass(), "lastRomVersion", "hXsByefZqZ");
        setField(term69618, term69618.getClass(), "lastDataVersion", "PfWKdFFgbz");
        setField(term69618, term69618.getClass(), "compatibleCmVersion", "rgmFLfFmTW");
        setField(term69618, term69618.getClass(), "lastPlayDate", "GHvFvelXFv");
        setIntField(term69618, term69618.getClass(), "lastPlaceId", 1112300927);
        setField(term69618, term69618.getClass(), "lastPlaceName", "MIDoqNmCoh");
        setIntField(term69618, term69618.getClass(), "lastRegionId", -840496589);
        setField(term69618, term69618.getClass(), "lastRegionName", "yrOIMfdQSI");
        setIntField(term69618, term69618.getClass(), "lastAllNetId", -491716923);
        setField(term69618, term69618.getClass(), "lastClientId", "PhtNZAacut");
        setIntField(term69618, term69618.getClass(), "lastUsedDeckId", -465766326);
        setIntField(term69618, term69618.getClass(), "lastPlayMusicLevel", 369314367);
        setIntField(term69618, term69618.getClass(), "lastEmoneyBrand", 256576657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xbPAqsSBBS";
        callMethod(klass, "setLastDataVersion", argTypes, term69618, args);
    }

};


