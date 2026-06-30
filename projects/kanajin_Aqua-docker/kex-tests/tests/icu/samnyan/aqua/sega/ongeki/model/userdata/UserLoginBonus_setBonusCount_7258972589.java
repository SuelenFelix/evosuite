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

public class UserLoginBonus_setBonusCount_7258972589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305251;
     Object term305530;

    public UserLoginBonus_setBonusCount_7258972589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term305257 = new Long(493557348274366095L);
        term305251 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term305253 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term305255 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term305271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term305272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term305276 = newInstance(Class.forName("java.time.LocalTime"));
        Object term305281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term305282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term305286 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term305251, term305251.getClass(), "id", -8722003150301906657L);
        setLongField(term305253, term305253.getClass(), "id", -1813766748211559836L);
        setLongField(term305255, term305255.getClass(), "id", 5404667378828091940L);
        setField(term305255, term305255.getClass(), "extId", term305257);
        setField(term305255, term305255.getClass(), "luid", "tYRyfLlFwR");
        setIntField(term305272, term305272.getClass(), "year", 2013);
        setShortField(term305272, term305272.getClass(), "month", (short) 12);
        setShortField(term305272, term305272.getClass(), "day", (short) 1);
        setField(term305271, term305271.getClass(), "date", term305272);
        setByteField(term305276, term305276.getClass(), "hour", (byte) 13);
        setByteField(term305276, term305276.getClass(), "minute", (byte) 49);
        setByteField(term305276, term305276.getClass(), "second", (byte) 17);
        setIntField(term305276, term305276.getClass(), "nano", 524715481);
        setField(term305271, term305271.getClass(), "time", term305276);
        setField(term305255, term305255.getClass(), "registerTime", term305271);
        setIntField(term305282, term305282.getClass(), "year", 2012);
        setShortField(term305282, term305282.getClass(), "month", (short) 1);
        setShortField(term305282, term305282.getClass(), "day", (short) 18);
        setField(term305281, term305281.getClass(), "date", term305282);
        setByteField(term305286, term305286.getClass(), "hour", (byte) 7);
        setByteField(term305286, term305286.getClass(), "minute", (byte) 1);
        setByteField(term305286, term305286.getClass(), "second", (byte) 3);
        setIntField(term305286, term305286.getClass(), "nano", 442037437);
        setField(term305281, term305281.getClass(), "time", term305286);
        setField(term305255, term305255.getClass(), "accessTime", term305281);
        setField(term305253, term305253.getClass(), "card", term305255);
        setField(term305253, term305253.getClass(), "userName", "cyzJelnZnf");
        setIntField(term305253, term305253.getClass(), "level", -717206333);
        setIntField(term305253, term305253.getClass(), "reincarnationNum", 1344256318);
        setLongField(term305253, term305253.getClass(), "exp", 7728982135180199769L);
        setLongField(term305253, term305253.getClass(), "point", -5146240282995592545L);
        setLongField(term305253, term305253.getClass(), "totalPoint", 2052872782377791560L);
        setIntField(term305253, term305253.getClass(), "playCount", -1217147133);
        setIntField(term305253, term305253.getClass(), "jewelCount", 824578055);
        setIntField(term305253, term305253.getClass(), "totalJewelCount", 1973211662);
        setIntField(term305253, term305253.getClass(), "medalCount", -856396125);
        setIntField(term305253, term305253.getClass(), "playerRating", -107146036);
        setIntField(term305253, term305253.getClass(), "highestRating", 454182534);
        setIntField(term305253, term305253.getClass(), "battlePoint", -843354184);
        setIntField(term305253, term305253.getClass(), "bestBattlePoint", 889022648);
        setIntField(term305253, term305253.getClass(), "overDamageBattlePoint", 282291623);
        setBooleanField(term305253, term305253.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term305253, term305253.getClass(), "nameplateId", 1200358947);
        setIntField(term305253, term305253.getClass(), "trophyId", 1825486717);
        setIntField(term305253, term305253.getClass(), "cardId", 1164838532);
        setIntField(term305253, term305253.getClass(), "characterId", 1845718720);
        setIntField(term305253, term305253.getClass(), "characterVoiceNo", -406124609);
        setIntField(term305253, term305253.getClass(), "tabSetting", -1356007129);
        setIntField(term305253, term305253.getClass(), "tabSortSetting", 18178207);
        setIntField(term305253, term305253.getClass(), "cardCategorySetting", 1434922903);
        setIntField(term305253, term305253.getClass(), "cardSortSetting", -2036478643);
        setIntField(term305253, term305253.getClass(), "rivalScoreCategorySetting", -565809872);
        setIntField(term305253, term305253.getClass(), "playedTutorialBit", -38942459);
        setIntField(term305253, term305253.getClass(), "firstTutorialCancelNum", -431476916);
        setLongField(term305253, term305253.getClass(), "sumTechHighScore", 2593192671838741563L);
        setLongField(term305253, term305253.getClass(), "sumTechBasicHighScore", -7841123625652564330L);
        setLongField(term305253, term305253.getClass(), "sumTechAdvancedHighScore", 2124933044909559337L);
        setLongField(term305253, term305253.getClass(), "sumTechExpertHighScore", 5174280850764484154L);
        setLongField(term305253, term305253.getClass(), "sumTechMasterHighScore", -2707130755527913661L);
        setLongField(term305253, term305253.getClass(), "sumTechLunaticHighScore", -942731374649399683L);
        setLongField(term305253, term305253.getClass(), "sumBattleHighScore", 2656365355335054963L);
        setLongField(term305253, term305253.getClass(), "sumBattleBasicHighScore", -418067085224357120L);
        setLongField(term305253, term305253.getClass(), "sumBattleAdvancedHighScore", -7306227489158476458L);
        setLongField(term305253, term305253.getClass(), "sumBattleExpertHighScore", -924561963763312381L);
        setLongField(term305253, term305253.getClass(), "sumBattleMasterHighScore", 4398182087851534619L);
        setLongField(term305253, term305253.getClass(), "sumBattleLunaticHighScore", 8016825904084147427L);
        setField(term305253, term305253.getClass(), "eventWatchedDate", "fsOzUshnsb");
        setField(term305253, term305253.getClass(), "cmEventWatchedDate", "GPQHPXZvWo");
        setField(term305253, term305253.getClass(), "firstGameId", "ryfICfuPmW");
        setField(term305253, term305253.getClass(), "firstRomVersion", "MvedeYpPGN");
        setField(term305253, term305253.getClass(), "firstDataVersion", "qAHfvXErtw");
        setField(term305253, term305253.getClass(), "firstPlayDate", "pQXxjfMbVr");
        setField(term305253, term305253.getClass(), "lastGameId", "yvzxlTzslz");
        setField(term305253, term305253.getClass(), "lastRomVersion", "WWKYyzWBuQ");
        setField(term305253, term305253.getClass(), "lastDataVersion", "JiQhYekDeJ");
        setField(term305253, term305253.getClass(), "compatibleCmVersion", "tEBKFtmwsy");
        setField(term305253, term305253.getClass(), "lastPlayDate", "dPenXKHvpD");
        setIntField(term305253, term305253.getClass(), "lastPlaceId", -662480951);
        setField(term305253, term305253.getClass(), "lastPlaceName", "FdDLKyiSTJ");
        setIntField(term305253, term305253.getClass(), "lastRegionId", 973137323);
        setField(term305253, term305253.getClass(), "lastRegionName", "kicHqYxIOg");
        setIntField(term305253, term305253.getClass(), "lastAllNetId", -1962675156);
        setField(term305253, term305253.getClass(), "lastClientId", "XYrfZHToau");
        setIntField(term305253, term305253.getClass(), "lastUsedDeckId", 717474332);
        setIntField(term305253, term305253.getClass(), "lastPlayMusicLevel", -908736408);
        setIntField(term305253, term305253.getClass(), "lastEmoneyBrand", 27470179);
        setField(term305251, term305251.getClass(), "user", term305253);
        setIntField(term305251, term305251.getClass(), "bonusId", 809443159);
        setIntField(term305251, term305251.getClass(), "bonusCount", 1889731371);
        setField(term305251, term305251.getClass(), "lastUpdateDate", "BXQOPEyMOL");
        term305530 = new Integer(576807184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term305530;
        callMethod(klass, "setBonusCount", argTypes, term305251, args);
    }

};


