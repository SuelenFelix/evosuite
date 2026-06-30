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

public class UserMissionPoint_getPoint_20742796024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8172;

    public UserMissionPoint_getPoint_20742796024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8178 = new Long(-4920224193275732920L);
        term8172 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term8174 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term8176 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term8192 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8193 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8197 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8202 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8203 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8207 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8172, term8172.getClass(), "id", 4525924047960478347L);
        setLongField(term8174, term8174.getClass(), "id", -3225860270104198596L);
        setLongField(term8176, term8176.getClass(), "id", -1164342036939643746L);
        setField(term8176, term8176.getClass(), "extId", term8178);
        setField(term8176, term8176.getClass(), "luid", "THZSpzBRYP");
        setIntField(term8193, term8193.getClass(), "year", 2023);
        setShortField(term8193, term8193.getClass(), "month", (short) 7);
        setShortField(term8193, term8193.getClass(), "day", (short) 16);
        setField(term8192, term8192.getClass(), "date", term8193);
        setByteField(term8197, term8197.getClass(), "hour", (byte) 3);
        setByteField(term8197, term8197.getClass(), "minute", (byte) 1);
        setByteField(term8197, term8197.getClass(), "second", (byte) 19);
        setIntField(term8197, term8197.getClass(), "nano", 488629554);
        setField(term8192, term8192.getClass(), "time", term8197);
        setField(term8176, term8176.getClass(), "registerTime", term8192);
        setIntField(term8203, term8203.getClass(), "year", 2018);
        setShortField(term8203, term8203.getClass(), "month", (short) 7);
        setShortField(term8203, term8203.getClass(), "day", (short) 12);
        setField(term8202, term8202.getClass(), "date", term8203);
        setByteField(term8207, term8207.getClass(), "hour", (byte) 1);
        setByteField(term8207, term8207.getClass(), "minute", (byte) 3);
        setByteField(term8207, term8207.getClass(), "second", (byte) 47);
        setIntField(term8207, term8207.getClass(), "nano", 2729929);
        setField(term8202, term8202.getClass(), "time", term8207);
        setField(term8176, term8176.getClass(), "accessTime", term8202);
        setField(term8174, term8174.getClass(), "card", term8176);
        setField(term8174, term8174.getClass(), "userName", "ZfBIVGBQOE");
        setIntField(term8174, term8174.getClass(), "level", 2634669);
        setIntField(term8174, term8174.getClass(), "reincarnationNum", -1912429941);
        setLongField(term8174, term8174.getClass(), "exp", -7013378340043571457L);
        setLongField(term8174, term8174.getClass(), "point", -3279534582096707294L);
        setLongField(term8174, term8174.getClass(), "totalPoint", -6490254947459640565L);
        setIntField(term8174, term8174.getClass(), "playCount", 1801052257);
        setIntField(term8174, term8174.getClass(), "jewelCount", -2110556060);
        setIntField(term8174, term8174.getClass(), "totalJewelCount", 313459791);
        setIntField(term8174, term8174.getClass(), "medalCount", 752615112);
        setIntField(term8174, term8174.getClass(), "playerRating", -1674430871);
        setIntField(term8174, term8174.getClass(), "highestRating", 794352120);
        setIntField(term8174, term8174.getClass(), "battlePoint", 340719678);
        setIntField(term8174, term8174.getClass(), "bestBattlePoint", 299791142);
        setIntField(term8174, term8174.getClass(), "overDamageBattlePoint", 1862191391);
        setBooleanField(term8174, term8174.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term8174, term8174.getClass(), "nameplateId", 1131398807);
        setIntField(term8174, term8174.getClass(), "trophyId", -344907703);
        setIntField(term8174, term8174.getClass(), "cardId", 824341437);
        setIntField(term8174, term8174.getClass(), "characterId", -1794965320);
        setIntField(term8174, term8174.getClass(), "characterVoiceNo", 520504102);
        setIntField(term8174, term8174.getClass(), "tabSetting", -457396133);
        setIntField(term8174, term8174.getClass(), "tabSortSetting", -1793950607);
        setIntField(term8174, term8174.getClass(), "cardCategorySetting", 1091954101);
        setIntField(term8174, term8174.getClass(), "cardSortSetting", 1895143076);
        setIntField(term8174, term8174.getClass(), "rivalScoreCategorySetting", 1981860404);
        setIntField(term8174, term8174.getClass(), "playedTutorialBit", 732174235);
        setIntField(term8174, term8174.getClass(), "firstTutorialCancelNum", 470895808);
        setLongField(term8174, term8174.getClass(), "sumTechHighScore", -7001094993638840490L);
        setLongField(term8174, term8174.getClass(), "sumTechBasicHighScore", 3077284143733577490L);
        setLongField(term8174, term8174.getClass(), "sumTechAdvancedHighScore", 4458302820344896046L);
        setLongField(term8174, term8174.getClass(), "sumTechExpertHighScore", -432424084523104253L);
        setLongField(term8174, term8174.getClass(), "sumTechMasterHighScore", 6150186973473930616L);
        setLongField(term8174, term8174.getClass(), "sumTechLunaticHighScore", -3850323135468805420L);
        setLongField(term8174, term8174.getClass(), "sumBattleHighScore", -5207216109884759743L);
        setLongField(term8174, term8174.getClass(), "sumBattleBasicHighScore", 8765880103547975810L);
        setLongField(term8174, term8174.getClass(), "sumBattleAdvancedHighScore", 4552367707739103094L);
        setLongField(term8174, term8174.getClass(), "sumBattleExpertHighScore", -6001151456088965547L);
        setLongField(term8174, term8174.getClass(), "sumBattleMasterHighScore", 1740732617708040141L);
        setLongField(term8174, term8174.getClass(), "sumBattleLunaticHighScore", 3472971833455746664L);
        setField(term8174, term8174.getClass(), "eventWatchedDate", "QSrDQfEsTR");
        setField(term8174, term8174.getClass(), "cmEventWatchedDate", "PsqusYmejD");
        setField(term8174, term8174.getClass(), "firstGameId", "NTWMiBEaDF");
        setField(term8174, term8174.getClass(), "firstRomVersion", "SPBstwKFVr");
        setField(term8174, term8174.getClass(), "firstDataVersion", "WxYUTuqmIq");
        setField(term8174, term8174.getClass(), "firstPlayDate", "OeQLvhVERT");
        setField(term8174, term8174.getClass(), "lastGameId", "IlvgFINwIa");
        setField(term8174, term8174.getClass(), "lastRomVersion", "GEJABPlHSI");
        setField(term8174, term8174.getClass(), "lastDataVersion", "aQFUvuaYxd");
        setField(term8174, term8174.getClass(), "compatibleCmVersion", "zNFLXMifnS");
        setField(term8174, term8174.getClass(), "lastPlayDate", "HHQcYMSBVc");
        setIntField(term8174, term8174.getClass(), "lastPlaceId", 1787325291);
        setField(term8174, term8174.getClass(), "lastPlaceName", "wdoqITnaAP");
        setIntField(term8174, term8174.getClass(), "lastRegionId", 1470349147);
        setField(term8174, term8174.getClass(), "lastRegionName", "rIPMBcrNqB");
        setIntField(term8174, term8174.getClass(), "lastAllNetId", -255317272);
        setField(term8174, term8174.getClass(), "lastClientId", "UDaboHZHhz");
        setIntField(term8174, term8174.getClass(), "lastUsedDeckId", -706253892);
        setIntField(term8174, term8174.getClass(), "lastPlayMusicLevel", -1341439819);
        setIntField(term8174, term8174.getClass(), "lastEmoneyBrand", -728760750);
        setField(term8172, term8172.getClass(), "user", term8174);
        setIntField(term8172, term8172.getClass(), "eventId", -1617383807);
        setLongField(term8172, term8172.getClass(), "point", 3731931947533293029L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term8172, args);
    }

};


