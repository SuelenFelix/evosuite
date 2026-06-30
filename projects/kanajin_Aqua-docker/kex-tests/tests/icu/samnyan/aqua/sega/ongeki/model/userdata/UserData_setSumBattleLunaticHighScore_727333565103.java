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

public class UserData_setSumBattleLunaticHighScore_727333565103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65633;
     Object term65896;

    public UserData_setSumBattleLunaticHighScore_727333565103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term65637 = new Long(3452833434644634217L);
        term65633 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term65635 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term65651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65666 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term65633, term65633.getClass(), "id", -5192359707785218791L);
        setLongField(term65635, term65635.getClass(), "id", 667203912128652795L);
        setField(term65635, term65635.getClass(), "extId", term65637);
        setField(term65635, term65635.getClass(), "luid", "NVsXpTZPoM");
        setIntField(term65652, term65652.getClass(), "year", 2025);
        setShortField(term65652, term65652.getClass(), "month", (short) 4);
        setShortField(term65652, term65652.getClass(), "day", (short) 6);
        setField(term65651, term65651.getClass(), "date", term65652);
        setByteField(term65656, term65656.getClass(), "hour", (byte) 23);
        setByteField(term65656, term65656.getClass(), "minute", (byte) 17);
        setByteField(term65656, term65656.getClass(), "second", (byte) 11);
        setIntField(term65656, term65656.getClass(), "nano", 928165672);
        setField(term65651, term65651.getClass(), "time", term65656);
        setField(term65635, term65635.getClass(), "registerTime", term65651);
        setIntField(term65662, term65662.getClass(), "year", 2022);
        setShortField(term65662, term65662.getClass(), "month", (short) 3);
        setShortField(term65662, term65662.getClass(), "day", (short) 20);
        setField(term65661, term65661.getClass(), "date", term65662);
        setByteField(term65666, term65666.getClass(), "hour", (byte) 20);
        setByteField(term65666, term65666.getClass(), "minute", (byte) 31);
        setByteField(term65666, term65666.getClass(), "second", (byte) 56);
        setIntField(term65666, term65666.getClass(), "nano", 682853702);
        setField(term65661, term65661.getClass(), "time", term65666);
        setField(term65635, term65635.getClass(), "accessTime", term65661);
        setField(term65633, term65633.getClass(), "card", term65635);
        setField(term65633, term65633.getClass(), "userName", "OlbhHDRGng");
        setIntField(term65633, term65633.getClass(), "level", -1662933444);
        setIntField(term65633, term65633.getClass(), "reincarnationNum", 1648583497);
        setLongField(term65633, term65633.getClass(), "exp", 6406550558830666117L);
        setLongField(term65633, term65633.getClass(), "point", 6809106978780494840L);
        setLongField(term65633, term65633.getClass(), "totalPoint", -6385753772670302830L);
        setIntField(term65633, term65633.getClass(), "playCount", -132156499);
        setIntField(term65633, term65633.getClass(), "jewelCount", -1222668512);
        setIntField(term65633, term65633.getClass(), "totalJewelCount", 1109294828);
        setIntField(term65633, term65633.getClass(), "medalCount", -596850824);
        setIntField(term65633, term65633.getClass(), "playerRating", 1619317687);
        setIntField(term65633, term65633.getClass(), "highestRating", -1335475299);
        setIntField(term65633, term65633.getClass(), "battlePoint", 1764067908);
        setIntField(term65633, term65633.getClass(), "bestBattlePoint", 1906236006);
        setIntField(term65633, term65633.getClass(), "overDamageBattlePoint", -279175941);
        setBooleanField(term65633, term65633.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term65633, term65633.getClass(), "nameplateId", -574044161);
        setIntField(term65633, term65633.getClass(), "trophyId", -101199395);
        setIntField(term65633, term65633.getClass(), "cardId", 894150826);
        setIntField(term65633, term65633.getClass(), "characterId", -261894603);
        setIntField(term65633, term65633.getClass(), "characterVoiceNo", 1163902450);
        setIntField(term65633, term65633.getClass(), "tabSetting", 548941697);
        setIntField(term65633, term65633.getClass(), "tabSortSetting", 647865140);
        setIntField(term65633, term65633.getClass(), "cardCategorySetting", 552764103);
        setIntField(term65633, term65633.getClass(), "cardSortSetting", -913811608);
        setIntField(term65633, term65633.getClass(), "rivalScoreCategorySetting", 895728550);
        setIntField(term65633, term65633.getClass(), "playedTutorialBit", -419871359);
        setIntField(term65633, term65633.getClass(), "firstTutorialCancelNum", 812478175);
        setLongField(term65633, term65633.getClass(), "sumTechHighScore", -5492665078635116313L);
        setLongField(term65633, term65633.getClass(), "sumTechBasicHighScore", -6642317903316072178L);
        setLongField(term65633, term65633.getClass(), "sumTechAdvancedHighScore", -8663415403140355626L);
        setLongField(term65633, term65633.getClass(), "sumTechExpertHighScore", -6164870242783962017L);
        setLongField(term65633, term65633.getClass(), "sumTechMasterHighScore", -852178810374130490L);
        setLongField(term65633, term65633.getClass(), "sumTechLunaticHighScore", 3557402050530427336L);
        setLongField(term65633, term65633.getClass(), "sumBattleHighScore", -8153392834863780469L);
        setLongField(term65633, term65633.getClass(), "sumBattleBasicHighScore", 2099475006510474987L);
        setLongField(term65633, term65633.getClass(), "sumBattleAdvancedHighScore", 8670871793677477111L);
        setLongField(term65633, term65633.getClass(), "sumBattleExpertHighScore", 1849019432435290766L);
        setLongField(term65633, term65633.getClass(), "sumBattleMasterHighScore", 1860828043112015415L);
        setLongField(term65633, term65633.getClass(), "sumBattleLunaticHighScore", -5221172945585313119L);
        setField(term65633, term65633.getClass(), "eventWatchedDate", "kbxuaUHTXf");
        setField(term65633, term65633.getClass(), "cmEventWatchedDate", "CwmyQhyiUR");
        setField(term65633, term65633.getClass(), "firstGameId", "PxwyuZAkGy");
        setField(term65633, term65633.getClass(), "firstRomVersion", "ODhSWAnZWd");
        setField(term65633, term65633.getClass(), "firstDataVersion", "NQkFXmkuYK");
        setField(term65633, term65633.getClass(), "firstPlayDate", "kHzsJWDHsz");
        setField(term65633, term65633.getClass(), "lastGameId", "jIfbtgnHqt");
        setField(term65633, term65633.getClass(), "lastRomVersion", "vNvzjymLXH");
        setField(term65633, term65633.getClass(), "lastDataVersion", "TCadyfXzAm");
        setField(term65633, term65633.getClass(), "compatibleCmVersion", "rSSEpZFUMc");
        setField(term65633, term65633.getClass(), "lastPlayDate", "DJHwHjvNlc");
        setIntField(term65633, term65633.getClass(), "lastPlaceId", -133199375);
        setField(term65633, term65633.getClass(), "lastPlaceName", "ZSBzHqaLtQ");
        setIntField(term65633, term65633.getClass(), "lastRegionId", -356245449);
        setField(term65633, term65633.getClass(), "lastRegionName", "DCRuiaVwNa");
        setIntField(term65633, term65633.getClass(), "lastAllNetId", -1305056502);
        setField(term65633, term65633.getClass(), "lastClientId", "VTjvZBqRUX");
        setIntField(term65633, term65633.getClass(), "lastUsedDeckId", 1382545880);
        setIntField(term65633, term65633.getClass(), "lastPlayMusicLevel", -1299406001);
        setIntField(term65633, term65633.getClass(), "lastEmoneyBrand", -1360145510);
        term65896 = new Long(-4331547344847792516L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term65896;
        callMethod(klass, "setSumBattleLunaticHighScore", argTypes, term65633, args);
    }

};


