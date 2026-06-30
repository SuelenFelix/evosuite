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
import java.lang.Integer;

public class UserData_setLastUsedDeckId_1668209155121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73563;
     Object term73826;

    public UserData_setLastUsedDeckId_1668209155121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term73567 = new Long(4502292577098212311L);
        term73563 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term73565 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term73581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73586 = newInstance(Class.forName("java.time.LocalTime"));
        Object term73591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73596 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term73563, term73563.getClass(), "id", 8860147662823251488L);
        setLongField(term73565, term73565.getClass(), "id", 6235472569901138913L);
        setField(term73565, term73565.getClass(), "extId", term73567);
        setField(term73565, term73565.getClass(), "luid", "RreVzKmtxf");
        setIntField(term73582, term73582.getClass(), "year", 2026);
        setShortField(term73582, term73582.getClass(), "month", (short) 7);
        setShortField(term73582, term73582.getClass(), "day", (short) 18);
        setField(term73581, term73581.getClass(), "date", term73582);
        setByteField(term73586, term73586.getClass(), "hour", (byte) 14);
        setByteField(term73586, term73586.getClass(), "minute", (byte) 29);
        setByteField(term73586, term73586.getClass(), "second", (byte) 53);
        setIntField(term73586, term73586.getClass(), "nano", 285756900);
        setField(term73581, term73581.getClass(), "time", term73586);
        setField(term73565, term73565.getClass(), "registerTime", term73581);
        setIntField(term73592, term73592.getClass(), "year", 2012);
        setShortField(term73592, term73592.getClass(), "month", (short) 2);
        setShortField(term73592, term73592.getClass(), "day", (short) 2);
        setField(term73591, term73591.getClass(), "date", term73592);
        setByteField(term73596, term73596.getClass(), "hour", (byte) 4);
        setByteField(term73596, term73596.getClass(), "minute", (byte) 19);
        setByteField(term73596, term73596.getClass(), "second", (byte) 58);
        setIntField(term73596, term73596.getClass(), "nano", 550709112);
        setField(term73591, term73591.getClass(), "time", term73596);
        setField(term73565, term73565.getClass(), "accessTime", term73591);
        setField(term73563, term73563.getClass(), "card", term73565);
        setField(term73563, term73563.getClass(), "userName", "xHBCsghEAi");
        setIntField(term73563, term73563.getClass(), "level", -38762037);
        setIntField(term73563, term73563.getClass(), "reincarnationNum", -200236986);
        setLongField(term73563, term73563.getClass(), "exp", -1732771393859471811L);
        setLongField(term73563, term73563.getClass(), "point", 376617836260009696L);
        setLongField(term73563, term73563.getClass(), "totalPoint", 7959584504878946737L);
        setIntField(term73563, term73563.getClass(), "playCount", -1078778523);
        setIntField(term73563, term73563.getClass(), "jewelCount", -1573140874);
        setIntField(term73563, term73563.getClass(), "totalJewelCount", 1252740231);
        setIntField(term73563, term73563.getClass(), "medalCount", -1494498996);
        setIntField(term73563, term73563.getClass(), "playerRating", -1230782196);
        setIntField(term73563, term73563.getClass(), "highestRating", 1988646780);
        setIntField(term73563, term73563.getClass(), "battlePoint", -1505639058);
        setIntField(term73563, term73563.getClass(), "bestBattlePoint", -1198622469);
        setIntField(term73563, term73563.getClass(), "overDamageBattlePoint", 254477121);
        setBooleanField(term73563, term73563.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term73563, term73563.getClass(), "nameplateId", -2097473055);
        setIntField(term73563, term73563.getClass(), "trophyId", 956173467);
        setIntField(term73563, term73563.getClass(), "cardId", -362299700);
        setIntField(term73563, term73563.getClass(), "characterId", -229025947);
        setIntField(term73563, term73563.getClass(), "characterVoiceNo", -2074615511);
        setIntField(term73563, term73563.getClass(), "tabSetting", -545948451);
        setIntField(term73563, term73563.getClass(), "tabSortSetting", -211944434);
        setIntField(term73563, term73563.getClass(), "cardCategorySetting", -558856994);
        setIntField(term73563, term73563.getClass(), "cardSortSetting", 329934484);
        setIntField(term73563, term73563.getClass(), "rivalScoreCategorySetting", 575431591);
        setIntField(term73563, term73563.getClass(), "playedTutorialBit", 912666310);
        setIntField(term73563, term73563.getClass(), "firstTutorialCancelNum", 302408238);
        setLongField(term73563, term73563.getClass(), "sumTechHighScore", -46420887778055199L);
        setLongField(term73563, term73563.getClass(), "sumTechBasicHighScore", 7667843194609869185L);
        setLongField(term73563, term73563.getClass(), "sumTechAdvancedHighScore", -6200837024273756516L);
        setLongField(term73563, term73563.getClass(), "sumTechExpertHighScore", 9046663610727775978L);
        setLongField(term73563, term73563.getClass(), "sumTechMasterHighScore", 6115702104023062411L);
        setLongField(term73563, term73563.getClass(), "sumTechLunaticHighScore", -7393121202464432000L);
        setLongField(term73563, term73563.getClass(), "sumBattleHighScore", -2126569881795166293L);
        setLongField(term73563, term73563.getClass(), "sumBattleBasicHighScore", 3910222794831758746L);
        setLongField(term73563, term73563.getClass(), "sumBattleAdvancedHighScore", -9065147632457577345L);
        setLongField(term73563, term73563.getClass(), "sumBattleExpertHighScore", 4051658878918665197L);
        setLongField(term73563, term73563.getClass(), "sumBattleMasterHighScore", -7721169040681572263L);
        setLongField(term73563, term73563.getClass(), "sumBattleLunaticHighScore", 3973799120661807990L);
        setField(term73563, term73563.getClass(), "eventWatchedDate", "BVlqqUSYbB");
        setField(term73563, term73563.getClass(), "cmEventWatchedDate", "hhGHcwcBqB");
        setField(term73563, term73563.getClass(), "firstGameId", "WIVENkFxNU");
        setField(term73563, term73563.getClass(), "firstRomVersion", "MFSosHURtm");
        setField(term73563, term73563.getClass(), "firstDataVersion", "hIBYlJpYye");
        setField(term73563, term73563.getClass(), "firstPlayDate", "LNendOzJhj");
        setField(term73563, term73563.getClass(), "lastGameId", "ZwcevQDgzv");
        setField(term73563, term73563.getClass(), "lastRomVersion", "rzkENrHYBI");
        setField(term73563, term73563.getClass(), "lastDataVersion", "ylJjmNVzzt");
        setField(term73563, term73563.getClass(), "compatibleCmVersion", "nwKTRDmHWk");
        setField(term73563, term73563.getClass(), "lastPlayDate", "UueEixdrss");
        setIntField(term73563, term73563.getClass(), "lastPlaceId", -685735773);
        setField(term73563, term73563.getClass(), "lastPlaceName", "ceafBXJyBB");
        setIntField(term73563, term73563.getClass(), "lastRegionId", -1229964213);
        setField(term73563, term73563.getClass(), "lastRegionName", "VNHIbCXqhH");
        setIntField(term73563, term73563.getClass(), "lastAllNetId", -206580016);
        setField(term73563, term73563.getClass(), "lastClientId", "csnhUIxUaP");
        setIntField(term73563, term73563.getClass(), "lastUsedDeckId", -982047423);
        setIntField(term73563, term73563.getClass(), "lastPlayMusicLevel", -1580085541);
        setIntField(term73563, term73563.getClass(), "lastEmoneyBrand", -1151473049);
        term73826 = new Integer(1472205129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term73826;
        callMethod(klass, "setLastUsedDeckId", argTypes, term73563, args);
    }

};


