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

public class UserData_getSumBattleBasicHighScore_101604985337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37569;

    public UserData_getSumBattleBasicHighScore_101604985337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37573 = new Long(4474998035090263139L);
        term37569 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term37571 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term37587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37598 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37602 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term37569, term37569.getClass(), "id", 8435776473049430167L);
        setLongField(term37571, term37571.getClass(), "id", -8317622314014853309L);
        setField(term37571, term37571.getClass(), "extId", term37573);
        setField(term37571, term37571.getClass(), "luid", "WzGudiEARD");
        setIntField(term37588, term37588.getClass(), "year", 2026);
        setShortField(term37588, term37588.getClass(), "month", (short) 7);
        setShortField(term37588, term37588.getClass(), "day", (short) 4);
        setField(term37587, term37587.getClass(), "date", term37588);
        setByteField(term37592, term37592.getClass(), "hour", (byte) 8);
        setByteField(term37592, term37592.getClass(), "minute", (byte) 51);
        setByteField(term37592, term37592.getClass(), "second", (byte) 9);
        setIntField(term37592, term37592.getClass(), "nano", 936880887);
        setField(term37587, term37587.getClass(), "time", term37592);
        setField(term37571, term37571.getClass(), "registerTime", term37587);
        setIntField(term37598, term37598.getClass(), "year", 2022);
        setShortField(term37598, term37598.getClass(), "month", (short) 5);
        setShortField(term37598, term37598.getClass(), "day", (short) 26);
        setField(term37597, term37597.getClass(), "date", term37598);
        setByteField(term37602, term37602.getClass(), "hour", (byte) 6);
        setByteField(term37602, term37602.getClass(), "minute", (byte) 54);
        setByteField(term37602, term37602.getClass(), "second", (byte) 49);
        setIntField(term37602, term37602.getClass(), "nano", 822216068);
        setField(term37597, term37597.getClass(), "time", term37602);
        setField(term37571, term37571.getClass(), "accessTime", term37597);
        setField(term37569, term37569.getClass(), "card", term37571);
        setField(term37569, term37569.getClass(), "userName", "IoefPqGtaj");
        setIntField(term37569, term37569.getClass(), "level", -267520884);
        setIntField(term37569, term37569.getClass(), "reincarnationNum", 1431716083);
        setLongField(term37569, term37569.getClass(), "exp", -5603191204578376681L);
        setLongField(term37569, term37569.getClass(), "point", -2371876403222577001L);
        setLongField(term37569, term37569.getClass(), "totalPoint", -876052271222651071L);
        setIntField(term37569, term37569.getClass(), "playCount", 1540004680);
        setIntField(term37569, term37569.getClass(), "jewelCount", -594861500);
        setIntField(term37569, term37569.getClass(), "totalJewelCount", 1731562923);
        setIntField(term37569, term37569.getClass(), "medalCount", 33467458);
        setIntField(term37569, term37569.getClass(), "playerRating", 1729034001);
        setIntField(term37569, term37569.getClass(), "highestRating", 1094810824);
        setIntField(term37569, term37569.getClass(), "battlePoint", -1746471324);
        setIntField(term37569, term37569.getClass(), "bestBattlePoint", 844485803);
        setIntField(term37569, term37569.getClass(), "overDamageBattlePoint", -1373407191);
        setBooleanField(term37569, term37569.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term37569, term37569.getClass(), "nameplateId", 1013516042);
        setIntField(term37569, term37569.getClass(), "trophyId", 284652039);
        setIntField(term37569, term37569.getClass(), "cardId", 1163350537);
        setIntField(term37569, term37569.getClass(), "characterId", -855026181);
        setIntField(term37569, term37569.getClass(), "characterVoiceNo", 1404243357);
        setIntField(term37569, term37569.getClass(), "tabSetting", -570134327);
        setIntField(term37569, term37569.getClass(), "tabSortSetting", 73847121);
        setIntField(term37569, term37569.getClass(), "cardCategorySetting", 1721050745);
        setIntField(term37569, term37569.getClass(), "cardSortSetting", -1980981205);
        setIntField(term37569, term37569.getClass(), "rivalScoreCategorySetting", -1530498856);
        setIntField(term37569, term37569.getClass(), "playedTutorialBit", 1816257051);
        setIntField(term37569, term37569.getClass(), "firstTutorialCancelNum", -541591725);
        setLongField(term37569, term37569.getClass(), "sumTechHighScore", 3831057373276674685L);
        setLongField(term37569, term37569.getClass(), "sumTechBasicHighScore", -239911533409145775L);
        setLongField(term37569, term37569.getClass(), "sumTechAdvancedHighScore", -474777108082218360L);
        setLongField(term37569, term37569.getClass(), "sumTechExpertHighScore", -7235419481645807819L);
        setLongField(term37569, term37569.getClass(), "sumTechMasterHighScore", -6917021920287966282L);
        setLongField(term37569, term37569.getClass(), "sumTechLunaticHighScore", 4137076813890606231L);
        setLongField(term37569, term37569.getClass(), "sumBattleHighScore", -562805980132245735L);
        setLongField(term37569, term37569.getClass(), "sumBattleBasicHighScore", 1095152021713790235L);
        setLongField(term37569, term37569.getClass(), "sumBattleAdvancedHighScore", 9070668522488722105L);
        setLongField(term37569, term37569.getClass(), "sumBattleExpertHighScore", 1784073150606702821L);
        setLongField(term37569, term37569.getClass(), "sumBattleMasterHighScore", -3116269489103564104L);
        setLongField(term37569, term37569.getClass(), "sumBattleLunaticHighScore", 8240231262183296861L);
        setField(term37569, term37569.getClass(), "eventWatchedDate", "YMmtjELJuB");
        setField(term37569, term37569.getClass(), "cmEventWatchedDate", "FzyIShiOmb");
        setField(term37569, term37569.getClass(), "firstGameId", "PEUfeJaZTk");
        setField(term37569, term37569.getClass(), "firstRomVersion", "AIvyeIdskz");
        setField(term37569, term37569.getClass(), "firstDataVersion", "iSQqMWMRlU");
        setField(term37569, term37569.getClass(), "firstPlayDate", "djWEnlbOXu");
        setField(term37569, term37569.getClass(), "lastGameId", "MvDMzQBWME");
        setField(term37569, term37569.getClass(), "lastRomVersion", "sZyAwmdGVS");
        setField(term37569, term37569.getClass(), "lastDataVersion", "VoKhXiLAaW");
        setField(term37569, term37569.getClass(), "compatibleCmVersion", "CaalXzRXQI");
        setField(term37569, term37569.getClass(), "lastPlayDate", "eRBnKPjyVg");
        setIntField(term37569, term37569.getClass(), "lastPlaceId", 498271385);
        setField(term37569, term37569.getClass(), "lastPlaceName", "svPqsHBvrm");
        setIntField(term37569, term37569.getClass(), "lastRegionId", 1418222767);
        setField(term37569, term37569.getClass(), "lastRegionName", "sRzUJLYMmB");
        setIntField(term37569, term37569.getClass(), "lastAllNetId", 1862441057);
        setField(term37569, term37569.getClass(), "lastClientId", "XxILklSDwz");
        setIntField(term37569, term37569.getClass(), "lastUsedDeckId", 1889814117);
        setIntField(term37569, term37569.getClass(), "lastPlayMusicLevel", -1336297368);
        setIntField(term37569, term37569.getClass(), "lastEmoneyBrand", 1535507114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleBasicHighScore", argTypes, term37569, args);
    }

};


