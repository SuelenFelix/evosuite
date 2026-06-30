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

public class UserData_getLastGameId_101377515648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42222;

    public UserData_getLastGameId_101377515648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42226 = new Long(-8085190702504231560L);
        term42222 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term42224 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term42240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42245 = newInstance(Class.forName("java.time.LocalTime"));
        Object term42250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42255 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term42222, term42222.getClass(), "id", 1746899333256847901L);
        setLongField(term42224, term42224.getClass(), "id", -6366307783743902404L);
        setField(term42224, term42224.getClass(), "extId", term42226);
        setField(term42224, term42224.getClass(), "luid", "TQuvAoQcBe");
        setIntField(term42241, term42241.getClass(), "year", 2021);
        setShortField(term42241, term42241.getClass(), "month", (short) 12);
        setShortField(term42241, term42241.getClass(), "day", (short) 23);
        setField(term42240, term42240.getClass(), "date", term42241);
        setByteField(term42245, term42245.getClass(), "hour", (byte) 18);
        setByteField(term42245, term42245.getClass(), "minute", (byte) 52);
        setByteField(term42245, term42245.getClass(), "second", (byte) 27);
        setIntField(term42245, term42245.getClass(), "nano", 512484524);
        setField(term42240, term42240.getClass(), "time", term42245);
        setField(term42224, term42224.getClass(), "registerTime", term42240);
        setIntField(term42251, term42251.getClass(), "year", 2012);
        setShortField(term42251, term42251.getClass(), "month", (short) 6);
        setShortField(term42251, term42251.getClass(), "day", (short) 25);
        setField(term42250, term42250.getClass(), "date", term42251);
        setByteField(term42255, term42255.getClass(), "hour", (byte) 2);
        setByteField(term42255, term42255.getClass(), "minute", (byte) 21);
        setByteField(term42255, term42255.getClass(), "second", (byte) 28);
        setIntField(term42255, term42255.getClass(), "nano", 605177282);
        setField(term42250, term42250.getClass(), "time", term42255);
        setField(term42224, term42224.getClass(), "accessTime", term42250);
        setField(term42222, term42222.getClass(), "card", term42224);
        setField(term42222, term42222.getClass(), "userName", "nGYLfZrtWO");
        setIntField(term42222, term42222.getClass(), "level", 846881911);
        setIntField(term42222, term42222.getClass(), "reincarnationNum", 780077059);
        setLongField(term42222, term42222.getClass(), "exp", -1515418567631326771L);
        setLongField(term42222, term42222.getClass(), "point", 5849423766693913056L);
        setLongField(term42222, term42222.getClass(), "totalPoint", -6427825980816337085L);
        setIntField(term42222, term42222.getClass(), "playCount", -924663332);
        setIntField(term42222, term42222.getClass(), "jewelCount", 579787883);
        setIntField(term42222, term42222.getClass(), "totalJewelCount", -1104816537);
        setIntField(term42222, term42222.getClass(), "medalCount", 1997406081);
        setIntField(term42222, term42222.getClass(), "playerRating", -160995016);
        setIntField(term42222, term42222.getClass(), "highestRating", -849730731);
        setIntField(term42222, term42222.getClass(), "battlePoint", -1965240023);
        setIntField(term42222, term42222.getClass(), "bestBattlePoint", -86860026);
        setIntField(term42222, term42222.getClass(), "overDamageBattlePoint", -444451515);
        setBooleanField(term42222, term42222.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term42222, term42222.getClass(), "nameplateId", -545419660);
        setIntField(term42222, term42222.getClass(), "trophyId", -1917689550);
        setIntField(term42222, term42222.getClass(), "cardId", 1829428325);
        setIntField(term42222, term42222.getClass(), "characterId", -1881843694);
        setIntField(term42222, term42222.getClass(), "characterVoiceNo", -1134250665);
        setIntField(term42222, term42222.getClass(), "tabSetting", -1607263638);
        setIntField(term42222, term42222.getClass(), "tabSortSetting", 691469974);
        setIntField(term42222, term42222.getClass(), "cardCategorySetting", -2080503799);
        setIntField(term42222, term42222.getClass(), "cardSortSetting", 13757525);
        setIntField(term42222, term42222.getClass(), "rivalScoreCategorySetting", 77853966);
        setIntField(term42222, term42222.getClass(), "playedTutorialBit", 1451393741);
        setIntField(term42222, term42222.getClass(), "firstTutorialCancelNum", -1115815564);
        setLongField(term42222, term42222.getClass(), "sumTechHighScore", -4544154238206615974L);
        setLongField(term42222, term42222.getClass(), "sumTechBasicHighScore", -8215564577884889289L);
        setLongField(term42222, term42222.getClass(), "sumTechAdvancedHighScore", 5775606940711844192L);
        setLongField(term42222, term42222.getClass(), "sumTechExpertHighScore", 3087842062616805600L);
        setLongField(term42222, term42222.getClass(), "sumTechMasterHighScore", 4204500285938159509L);
        setLongField(term42222, term42222.getClass(), "sumTechLunaticHighScore", -1244994280899830819L);
        setLongField(term42222, term42222.getClass(), "sumBattleHighScore", -6694319636219671027L);
        setLongField(term42222, term42222.getClass(), "sumBattleBasicHighScore", -3473081969778151336L);
        setLongField(term42222, term42222.getClass(), "sumBattleAdvancedHighScore", 6622018619505451280L);
        setLongField(term42222, term42222.getClass(), "sumBattleExpertHighScore", 1984951428829541736L);
        setLongField(term42222, term42222.getClass(), "sumBattleMasterHighScore", 281955242959047454L);
        setLongField(term42222, term42222.getClass(), "sumBattleLunaticHighScore", 863677123934073271L);
        setField(term42222, term42222.getClass(), "eventWatchedDate", "DBufEhhBCQ");
        setField(term42222, term42222.getClass(), "cmEventWatchedDate", "GiNZRBZjgO");
        setField(term42222, term42222.getClass(), "firstGameId", "ceGAKcClsG");
        setField(term42222, term42222.getClass(), "firstRomVersion", "SEldZGJyvX");
        setField(term42222, term42222.getClass(), "firstDataVersion", "vyvpqcHTQN");
        setField(term42222, term42222.getClass(), "firstPlayDate", "QQcpNMSHvA");
        setField(term42222, term42222.getClass(), "lastGameId", "FLLklaMZvg");
        setField(term42222, term42222.getClass(), "lastRomVersion", "jRDZpkFkoD");
        setField(term42222, term42222.getClass(), "lastDataVersion", "wwSknqIBIO");
        setField(term42222, term42222.getClass(), "compatibleCmVersion", "zQPAxUFaeX");
        setField(term42222, term42222.getClass(), "lastPlayDate", "cKNHUkrYfK");
        setIntField(term42222, term42222.getClass(), "lastPlaceId", 425132480);
        setField(term42222, term42222.getClass(), "lastPlaceName", "crMeWqJOCQ");
        setIntField(term42222, term42222.getClass(), "lastRegionId", 1968674006);
        setField(term42222, term42222.getClass(), "lastRegionName", "VUVgiQvSYa");
        setIntField(term42222, term42222.getClass(), "lastAllNetId", -634536248);
        setField(term42222, term42222.getClass(), "lastClientId", "sEGgJJplmE");
        setIntField(term42222, term42222.getClass(), "lastUsedDeckId", 1090329667);
        setIntField(term42222, term42222.getClass(), "lastPlayMusicLevel", -1082123686);
        setIntField(term42222, term42222.getClass(), "lastEmoneyBrand", -991011239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term42222, args);
    }

};


