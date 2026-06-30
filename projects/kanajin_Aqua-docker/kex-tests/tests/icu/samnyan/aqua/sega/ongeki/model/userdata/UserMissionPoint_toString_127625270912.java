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

public class UserMissionPoint_toString_127625270912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12019;

    public UserMissionPoint_toString_127625270912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12025 = new Long(1967728129628047933L);
        term12019 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term12021 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term12023 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term12039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12054 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12019, term12019.getClass(), "id", 6695041041196724237L);
        setLongField(term12021, term12021.getClass(), "id", -9133417318192430290L);
        setLongField(term12023, term12023.getClass(), "id", 3447455321955655601L);
        setField(term12023, term12023.getClass(), "extId", term12025);
        setField(term12023, term12023.getClass(), "luid", "mKaHyMybrK");
        setIntField(term12040, term12040.getClass(), "year", 2022);
        setShortField(term12040, term12040.getClass(), "month", (short) 6);
        setShortField(term12040, term12040.getClass(), "day", (short) 20);
        setField(term12039, term12039.getClass(), "date", term12040);
        setByteField(term12044, term12044.getClass(), "hour", (byte) 7);
        setByteField(term12044, term12044.getClass(), "minute", (byte) 57);
        setByteField(term12044, term12044.getClass(), "second", (byte) 37);
        setIntField(term12044, term12044.getClass(), "nano", 90374877);
        setField(term12039, term12039.getClass(), "time", term12044);
        setField(term12023, term12023.getClass(), "registerTime", term12039);
        setIntField(term12050, term12050.getClass(), "year", 2023);
        setShortField(term12050, term12050.getClass(), "month", (short) 2);
        setShortField(term12050, term12050.getClass(), "day", (short) 16);
        setField(term12049, term12049.getClass(), "date", term12050);
        setByteField(term12054, term12054.getClass(), "hour", (byte) 3);
        setByteField(term12054, term12054.getClass(), "minute", (byte) 18);
        setByteField(term12054, term12054.getClass(), "second", (byte) 56);
        setIntField(term12054, term12054.getClass(), "nano", 733017887);
        setField(term12049, term12049.getClass(), "time", term12054);
        setField(term12023, term12023.getClass(), "accessTime", term12049);
        setField(term12021, term12021.getClass(), "card", term12023);
        setField(term12021, term12021.getClass(), "userName", "AyrEXuGrEj");
        setIntField(term12021, term12021.getClass(), "level", -95969566);
        setIntField(term12021, term12021.getClass(), "reincarnationNum", -68615285);
        setLongField(term12021, term12021.getClass(), "exp", -6503611645609982617L);
        setLongField(term12021, term12021.getClass(), "point", -7574091101944828886L);
        setLongField(term12021, term12021.getClass(), "totalPoint", -6792339614909987294L);
        setIntField(term12021, term12021.getClass(), "playCount", -337504086);
        setIntField(term12021, term12021.getClass(), "jewelCount", 2074130991);
        setIntField(term12021, term12021.getClass(), "totalJewelCount", 532588266);
        setIntField(term12021, term12021.getClass(), "medalCount", -1286686332);
        setIntField(term12021, term12021.getClass(), "playerRating", -284885486);
        setIntField(term12021, term12021.getClass(), "highestRating", 1791984446);
        setIntField(term12021, term12021.getClass(), "battlePoint", 804070622);
        setIntField(term12021, term12021.getClass(), "bestBattlePoint", 1850364894);
        setIntField(term12021, term12021.getClass(), "overDamageBattlePoint", 915367534);
        setBooleanField(term12021, term12021.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term12021, term12021.getClass(), "nameplateId", 1949983666);
        setIntField(term12021, term12021.getClass(), "trophyId", 154111854);
        setIntField(term12021, term12021.getClass(), "cardId", 710986341);
        setIntField(term12021, term12021.getClass(), "characterId", -873958002);
        setIntField(term12021, term12021.getClass(), "characterVoiceNo", -1780848958);
        setIntField(term12021, term12021.getClass(), "tabSetting", 1235045850);
        setIntField(term12021, term12021.getClass(), "tabSortSetting", -75143033);
        setIntField(term12021, term12021.getClass(), "cardCategorySetting", 797015478);
        setIntField(term12021, term12021.getClass(), "cardSortSetting", 717574276);
        setIntField(term12021, term12021.getClass(), "rivalScoreCategorySetting", 1795369860);
        setIntField(term12021, term12021.getClass(), "playedTutorialBit", -570164389);
        setIntField(term12021, term12021.getClass(), "firstTutorialCancelNum", 43200329);
        setLongField(term12021, term12021.getClass(), "sumTechHighScore", -1978508496784157882L);
        setLongField(term12021, term12021.getClass(), "sumTechBasicHighScore", -7840999196900383276L);
        setLongField(term12021, term12021.getClass(), "sumTechAdvancedHighScore", 1528628920302068646L);
        setLongField(term12021, term12021.getClass(), "sumTechExpertHighScore", 3161040540173678206L);
        setLongField(term12021, term12021.getClass(), "sumTechMasterHighScore", 8640463098965331396L);
        setLongField(term12021, term12021.getClass(), "sumTechLunaticHighScore", -4136906775323730350L);
        setLongField(term12021, term12021.getClass(), "sumBattleHighScore", 6381166215871562039L);
        setLongField(term12021, term12021.getClass(), "sumBattleBasicHighScore", 7656211287234019484L);
        setLongField(term12021, term12021.getClass(), "sumBattleAdvancedHighScore", -872579514000598474L);
        setLongField(term12021, term12021.getClass(), "sumBattleExpertHighScore", 5097769785635819744L);
        setLongField(term12021, term12021.getClass(), "sumBattleMasterHighScore", 9192899183781208922L);
        setLongField(term12021, term12021.getClass(), "sumBattleLunaticHighScore", -7705159544905337794L);
        setField(term12021, term12021.getClass(), "eventWatchedDate", "yevIIoVYHq");
        setField(term12021, term12021.getClass(), "cmEventWatchedDate", "UuYWMTqWTV");
        setField(term12021, term12021.getClass(), "firstGameId", "DSFGlcaXUb");
        setField(term12021, term12021.getClass(), "firstRomVersion", "sHMXNUzNeM");
        setField(term12021, term12021.getClass(), "firstDataVersion", "gPzGDOEPPw");
        setField(term12021, term12021.getClass(), "firstPlayDate", "rwKoAngzCu");
        setField(term12021, term12021.getClass(), "lastGameId", "VUkRVwROTl");
        setField(term12021, term12021.getClass(), "lastRomVersion", "UDlkdccCRn");
        setField(term12021, term12021.getClass(), "lastDataVersion", "McpzErOcYb");
        setField(term12021, term12021.getClass(), "compatibleCmVersion", "jqrVEUvYEz");
        setField(term12021, term12021.getClass(), "lastPlayDate", "QITgiBrmfj");
        setIntField(term12021, term12021.getClass(), "lastPlaceId", 998679955);
        setField(term12021, term12021.getClass(), "lastPlaceName", "pXxkiXgQnq");
        setIntField(term12021, term12021.getClass(), "lastRegionId", 953741504);
        setField(term12021, term12021.getClass(), "lastRegionName", "tKmrUDURku");
        setIntField(term12021, term12021.getClass(), "lastAllNetId", 1389452261);
        setField(term12021, term12021.getClass(), "lastClientId", "JeZbrwZmsP");
        setIntField(term12021, term12021.getClass(), "lastUsedDeckId", 1615957955);
        setIntField(term12021, term12021.getClass(), "lastPlayMusicLevel", 1779370220);
        setIntField(term12021, term12021.getClass(), "lastEmoneyBrand", -1716046610);
        setField(term12019, term12019.getClass(), "user", term12021);
        setIntField(term12019, term12019.getClass(), "eventId", 65264024);
        setLongField(term12019, term12019.getClass(), "point", 678465732474023847L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12019, args);
    }

};


