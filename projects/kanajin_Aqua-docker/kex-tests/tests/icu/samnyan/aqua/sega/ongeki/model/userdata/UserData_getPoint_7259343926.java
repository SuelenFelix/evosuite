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

public class UserData_getPoint_7259343926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24456;

    public UserData_getPoint_7259343926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24460 = new Long(-1468719814009985452L);
        term24456 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term24458 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term24474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24479 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24489 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term24456, term24456.getClass(), "id", 9105566407535624519L);
        setLongField(term24458, term24458.getClass(), "id", 8850312777693707693L);
        setField(term24458, term24458.getClass(), "extId", term24460);
        setField(term24458, term24458.getClass(), "luid", "TwaxeSHvnR");
        setIntField(term24475, term24475.getClass(), "year", 2029);
        setShortField(term24475, term24475.getClass(), "month", (short) 7);
        setShortField(term24475, term24475.getClass(), "day", (short) 19);
        setField(term24474, term24474.getClass(), "date", term24475);
        setByteField(term24479, term24479.getClass(), "hour", (byte) 17);
        setByteField(term24479, term24479.getClass(), "minute", (byte) 37);
        setByteField(term24479, term24479.getClass(), "second", (byte) 21);
        setIntField(term24479, term24479.getClass(), "nano", 320093277);
        setField(term24474, term24474.getClass(), "time", term24479);
        setField(term24458, term24458.getClass(), "registerTime", term24474);
        setIntField(term24485, term24485.getClass(), "year", 2028);
        setShortField(term24485, term24485.getClass(), "month", (short) 1);
        setShortField(term24485, term24485.getClass(), "day", (short) 11);
        setField(term24484, term24484.getClass(), "date", term24485);
        setByteField(term24489, term24489.getClass(), "hour", (byte) 22);
        setByteField(term24489, term24489.getClass(), "minute", (byte) 3);
        setByteField(term24489, term24489.getClass(), "second", (byte) 39);
        setIntField(term24489, term24489.getClass(), "nano", 175567313);
        setField(term24484, term24484.getClass(), "time", term24489);
        setField(term24458, term24458.getClass(), "accessTime", term24484);
        setField(term24456, term24456.getClass(), "card", term24458);
        setField(term24456, term24456.getClass(), "userName", "paPzDETzIq");
        setIntField(term24456, term24456.getClass(), "level", 144872711);
        setIntField(term24456, term24456.getClass(), "reincarnationNum", -720037395);
        setLongField(term24456, term24456.getClass(), "exp", 1038272501243892514L);
        setLongField(term24456, term24456.getClass(), "point", -5787975575293098129L);
        setLongField(term24456, term24456.getClass(), "totalPoint", -2214621750590649821L);
        setIntField(term24456, term24456.getClass(), "playCount", 1232105469);
        setIntField(term24456, term24456.getClass(), "jewelCount", -1547322575);
        setIntField(term24456, term24456.getClass(), "totalJewelCount", -61444233);
        setIntField(term24456, term24456.getClass(), "medalCount", -400720912);
        setIntField(term24456, term24456.getClass(), "playerRating", 1266192397);
        setIntField(term24456, term24456.getClass(), "highestRating", 218346781);
        setIntField(term24456, term24456.getClass(), "battlePoint", -984660976);
        setIntField(term24456, term24456.getClass(), "bestBattlePoint", -1419341969);
        setIntField(term24456, term24456.getClass(), "overDamageBattlePoint", -89522625);
        setBooleanField(term24456, term24456.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term24456, term24456.getClass(), "nameplateId", 1475906894);
        setIntField(term24456, term24456.getClass(), "trophyId", -2004794532);
        setIntField(term24456, term24456.getClass(), "cardId", 1232958763);
        setIntField(term24456, term24456.getClass(), "characterId", -1702132549);
        setIntField(term24456, term24456.getClass(), "characterVoiceNo", -1786136772);
        setIntField(term24456, term24456.getClass(), "tabSetting", -1510967747);
        setIntField(term24456, term24456.getClass(), "tabSortSetting", -2014792457);
        setIntField(term24456, term24456.getClass(), "cardCategorySetting", 1957633116);
        setIntField(term24456, term24456.getClass(), "cardSortSetting", 1428598210);
        setIntField(term24456, term24456.getClass(), "rivalScoreCategorySetting", 1071776561);
        setIntField(term24456, term24456.getClass(), "playedTutorialBit", 1846399918);
        setIntField(term24456, term24456.getClass(), "firstTutorialCancelNum", 35388821);
        setLongField(term24456, term24456.getClass(), "sumTechHighScore", -480743639677441412L);
        setLongField(term24456, term24456.getClass(), "sumTechBasicHighScore", 4618470175243384123L);
        setLongField(term24456, term24456.getClass(), "sumTechAdvancedHighScore", 1747819662947425876L);
        setLongField(term24456, term24456.getClass(), "sumTechExpertHighScore", 8085945615925723302L);
        setLongField(term24456, term24456.getClass(), "sumTechMasterHighScore", 5874242482849721868L);
        setLongField(term24456, term24456.getClass(), "sumTechLunaticHighScore", 682045578778432659L);
        setLongField(term24456, term24456.getClass(), "sumBattleHighScore", -1059217926759861865L);
        setLongField(term24456, term24456.getClass(), "sumBattleBasicHighScore", 4331712795558033930L);
        setLongField(term24456, term24456.getClass(), "sumBattleAdvancedHighScore", 8180021874498524998L);
        setLongField(term24456, term24456.getClass(), "sumBattleExpertHighScore", 732331270654896650L);
        setLongField(term24456, term24456.getClass(), "sumBattleMasterHighScore", 8578289401978257809L);
        setLongField(term24456, term24456.getClass(), "sumBattleLunaticHighScore", -1719189544794576143L);
        setField(term24456, term24456.getClass(), "eventWatchedDate", "fufeuGfwpN");
        setField(term24456, term24456.getClass(), "cmEventWatchedDate", "XJbkXbljvz");
        setField(term24456, term24456.getClass(), "firstGameId", "fuvdkDwBeH");
        setField(term24456, term24456.getClass(), "firstRomVersion", "NTefzwLPhx");
        setField(term24456, term24456.getClass(), "firstDataVersion", "dirFuhqyNu");
        setField(term24456, term24456.getClass(), "firstPlayDate", "YVLRenzuoR");
        setField(term24456, term24456.getClass(), "lastGameId", "JukEMhPWql");
        setField(term24456, term24456.getClass(), "lastRomVersion", "ZdNcodHERG");
        setField(term24456, term24456.getClass(), "lastDataVersion", "CLHomjAqIM");
        setField(term24456, term24456.getClass(), "compatibleCmVersion", "mzCFLzFuSj");
        setField(term24456, term24456.getClass(), "lastPlayDate", "WQnMpDlSfA");
        setIntField(term24456, term24456.getClass(), "lastPlaceId", -598803400);
        setField(term24456, term24456.getClass(), "lastPlaceName", "aOIvTQtXiv");
        setIntField(term24456, term24456.getClass(), "lastRegionId", 25560022);
        setField(term24456, term24456.getClass(), "lastRegionName", "IyjDiknqhA");
        setIntField(term24456, term24456.getClass(), "lastAllNetId", -1090136985);
        setField(term24456, term24456.getClass(), "lastClientId", "IHsXSAFYKi");
        setIntField(term24456, term24456.getClass(), "lastUsedDeckId", -355574894);
        setIntField(term24456, term24456.getClass(), "lastPlayMusicLevel", 1866941633);
        setIntField(term24456, term24456.getClass(), "lastEmoneyBrand", 1697296048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term24456, args);
    }

};


