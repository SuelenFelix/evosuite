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

public class UserDeck_setCardId2_8495861411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147140;
     Object term147409;

    public UserDeck_setCardId2_8495861411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147146 = new Long(-5951743062322506095L);
        term147140 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term147142 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term147144 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term147160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147175 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term147140, term147140.getClass(), "id", -2229737232808794840L);
        setLongField(term147142, term147142.getClass(), "id", 8814665564896561118L);
        setLongField(term147144, term147144.getClass(), "id", 2174889037593197008L);
        setField(term147144, term147144.getClass(), "extId", term147146);
        setField(term147144, term147144.getClass(), "luid", "mAdGuGUmMs");
        setIntField(term147161, term147161.getClass(), "year", 2012);
        setShortField(term147161, term147161.getClass(), "month", (short) 6);
        setShortField(term147161, term147161.getClass(), "day", (short) 22);
        setField(term147160, term147160.getClass(), "date", term147161);
        setByteField(term147165, term147165.getClass(), "hour", (byte) 2);
        setByteField(term147165, term147165.getClass(), "minute", (byte) 38);
        setByteField(term147165, term147165.getClass(), "second", (byte) 18);
        setIntField(term147165, term147165.getClass(), "nano", 496783713);
        setField(term147160, term147160.getClass(), "time", term147165);
        setField(term147144, term147144.getClass(), "registerTime", term147160);
        setIntField(term147171, term147171.getClass(), "year", 2024);
        setShortField(term147171, term147171.getClass(), "month", (short) 11);
        setShortField(term147171, term147171.getClass(), "day", (short) 23);
        setField(term147170, term147170.getClass(), "date", term147171);
        setByteField(term147175, term147175.getClass(), "hour", (byte) 12);
        setByteField(term147175, term147175.getClass(), "minute", (byte) 39);
        setByteField(term147175, term147175.getClass(), "second", (byte) 16);
        setIntField(term147175, term147175.getClass(), "nano", 452723100);
        setField(term147170, term147170.getClass(), "time", term147175);
        setField(term147144, term147144.getClass(), "accessTime", term147170);
        setField(term147142, term147142.getClass(), "card", term147144);
        setField(term147142, term147142.getClass(), "userName", "ZrdXdCxwDU");
        setIntField(term147142, term147142.getClass(), "level", 336049478);
        setIntField(term147142, term147142.getClass(), "reincarnationNum", -450701337);
        setLongField(term147142, term147142.getClass(), "exp", 7000243387644218L);
        setLongField(term147142, term147142.getClass(), "point", 6714616046267471642L);
        setLongField(term147142, term147142.getClass(), "totalPoint", 5266853697070243108L);
        setIntField(term147142, term147142.getClass(), "playCount", 381290182);
        setIntField(term147142, term147142.getClass(), "jewelCount", -259833170);
        setIntField(term147142, term147142.getClass(), "totalJewelCount", 794710786);
        setIntField(term147142, term147142.getClass(), "medalCount", -1974421233);
        setIntField(term147142, term147142.getClass(), "playerRating", -1476827783);
        setIntField(term147142, term147142.getClass(), "highestRating", 895409963);
        setIntField(term147142, term147142.getClass(), "battlePoint", 1476827497);
        setIntField(term147142, term147142.getClass(), "bestBattlePoint", -2093258796);
        setIntField(term147142, term147142.getClass(), "overDamageBattlePoint", 444674138);
        setBooleanField(term147142, term147142.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term147142, term147142.getClass(), "nameplateId", 1966779557);
        setIntField(term147142, term147142.getClass(), "trophyId", -1632216455);
        setIntField(term147142, term147142.getClass(), "cardId", 134123162);
        setIntField(term147142, term147142.getClass(), "characterId", 1270482013);
        setIntField(term147142, term147142.getClass(), "characterVoiceNo", -304419371);
        setIntField(term147142, term147142.getClass(), "tabSetting", -1565193689);
        setIntField(term147142, term147142.getClass(), "tabSortSetting", 954482242);
        setIntField(term147142, term147142.getClass(), "cardCategorySetting", -1145866715);
        setIntField(term147142, term147142.getClass(), "cardSortSetting", -792401883);
        setIntField(term147142, term147142.getClass(), "rivalScoreCategorySetting", -1513455266);
        setIntField(term147142, term147142.getClass(), "playedTutorialBit", 1576242915);
        setIntField(term147142, term147142.getClass(), "firstTutorialCancelNum", -13617495);
        setLongField(term147142, term147142.getClass(), "sumTechHighScore", -3367407358676136810L);
        setLongField(term147142, term147142.getClass(), "sumTechBasicHighScore", -4476783276751255541L);
        setLongField(term147142, term147142.getClass(), "sumTechAdvancedHighScore", 4043147868711824049L);
        setLongField(term147142, term147142.getClass(), "sumTechExpertHighScore", 4068787646656666006L);
        setLongField(term147142, term147142.getClass(), "sumTechMasterHighScore", -7064942865402523665L);
        setLongField(term147142, term147142.getClass(), "sumTechLunaticHighScore", 5307024026480104828L);
        setLongField(term147142, term147142.getClass(), "sumBattleHighScore", -4528790733397440905L);
        setLongField(term147142, term147142.getClass(), "sumBattleBasicHighScore", 925259483309713075L);
        setLongField(term147142, term147142.getClass(), "sumBattleAdvancedHighScore", -9046989870079052332L);
        setLongField(term147142, term147142.getClass(), "sumBattleExpertHighScore", -9061954850675855156L);
        setLongField(term147142, term147142.getClass(), "sumBattleMasterHighScore", 4800283641344945401L);
        setLongField(term147142, term147142.getClass(), "sumBattleLunaticHighScore", 1811244998293066653L);
        setField(term147142, term147142.getClass(), "eventWatchedDate", "FhewVVfjkr");
        setField(term147142, term147142.getClass(), "cmEventWatchedDate", "jpTElJfbPa");
        setField(term147142, term147142.getClass(), "firstGameId", "iJIxuKpvyK");
        setField(term147142, term147142.getClass(), "firstRomVersion", "lbevHCeIaq");
        setField(term147142, term147142.getClass(), "firstDataVersion", "SfNhJpAvgC");
        setField(term147142, term147142.getClass(), "firstPlayDate", "omHQnPTsZR");
        setField(term147142, term147142.getClass(), "lastGameId", "ffLERohsXA");
        setField(term147142, term147142.getClass(), "lastRomVersion", "zMTUAmZToL");
        setField(term147142, term147142.getClass(), "lastDataVersion", "lnDYutrxeh");
        setField(term147142, term147142.getClass(), "compatibleCmVersion", "cTHQspxtSw");
        setField(term147142, term147142.getClass(), "lastPlayDate", "RkPKoKjNWD");
        setIntField(term147142, term147142.getClass(), "lastPlaceId", -1165634173);
        setField(term147142, term147142.getClass(), "lastPlaceName", "WWCtVebkwF");
        setIntField(term147142, term147142.getClass(), "lastRegionId", -634884793);
        setField(term147142, term147142.getClass(), "lastRegionName", "hEqFqciiYC");
        setIntField(term147142, term147142.getClass(), "lastAllNetId", 1476138937);
        setField(term147142, term147142.getClass(), "lastClientId", "kMXoOfTYML");
        setIntField(term147142, term147142.getClass(), "lastUsedDeckId", 1547525653);
        setIntField(term147142, term147142.getClass(), "lastPlayMusicLevel", 244752248);
        setIntField(term147142, term147142.getClass(), "lastEmoneyBrand", -354095413);
        setField(term147140, term147140.getClass(), "user", term147142);
        setIntField(term147140, term147140.getClass(), "deckId", 1842115165);
        setIntField(term147140, term147140.getClass(), "cardId1", 809042157);
        setIntField(term147140, term147140.getClass(), "cardId2", 123189112);
        setIntField(term147140, term147140.getClass(), "cardId3", 1409363541);
        term147409 = new Integer(-529449674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term147409;
        callMethod(klass, "setCardId2", argTypes, term147140, args);
    }

};


