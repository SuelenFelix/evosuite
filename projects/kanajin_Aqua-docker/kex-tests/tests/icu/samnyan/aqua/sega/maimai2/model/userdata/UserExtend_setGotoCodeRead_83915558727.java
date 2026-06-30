package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;

public class UserExtend_setGotoCodeRead_83915558727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158104;
     Object term158483;

    public UserExtend_setGotoCodeRead_83915558727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term158110 = new Long(-9204303423581447271L);
        Integer term158173 = new Integer(-313873930);
        Integer term158175 = new Integer(-1064231188);
        Integer term158177 = new Integer(1631564781);
        Integer term158179 = new Integer(-3085808);
        ArrayList term158171 = new ArrayList();
        ((ArrayList) term158171).add(term158173);
        ((ArrayList) term158171).add(term158175);
        ((ArrayList) term158171).add(term158177);
        ((ArrayList) term158171).add(term158179);
        ArrayList term158183 = new ArrayList();
        Integer term158467 = new Integer(1975783377);
        Integer term158469 = new Integer(-665938382);
        Integer term158471 = new Integer(325391588);
        Integer term158473 = new Integer(1443046313);
        Integer term158475 = new Integer(1055117337);
        ArrayList term158465 = new ArrayList();
        ((ArrayList) term158465).add(term158467);
        ((ArrayList) term158465).add(term158469);
        ((ArrayList) term158465).add(term158471);
        ((ArrayList) term158465).add(term158473);
        ((ArrayList) term158465).add(term158475);
        ArrayList term158479 = new ArrayList();
        term158104 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term158106 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term158108 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term158124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158129 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158139 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term158104, term158104.getClass(), "id", 6849625697033516355L);
        setLongField(term158106, term158106.getClass(), "id", -7258390453288297477L);
        setLongField(term158108, term158108.getClass(), "id", -6697023539048814763L);
        setField(term158108, term158108.getClass(), "extId", term158110);
        setField(term158108, term158108.getClass(), "luid", "rYzEwQHkaO");
        setIntField(term158125, term158125.getClass(), "year", 2010);
        setShortField(term158125, term158125.getClass(), "month", (short) 1);
        setShortField(term158125, term158125.getClass(), "day", (short) 25);
        setField(term158124, term158124.getClass(), "date", term158125);
        setByteField(term158129, term158129.getClass(), "hour", (byte) 2);
        setByteField(term158129, term158129.getClass(), "minute", (byte) 58);
        setByteField(term158129, term158129.getClass(), "second", (byte) 38);
        setIntField(term158129, term158129.getClass(), "nano", 91985442);
        setField(term158124, term158124.getClass(), "time", term158129);
        setField(term158108, term158108.getClass(), "registerTime", term158124);
        setIntField(term158135, term158135.getClass(), "year", 2016);
        setShortField(term158135, term158135.getClass(), "month", (short) 8);
        setShortField(term158135, term158135.getClass(), "day", (short) 5);
        setField(term158134, term158134.getClass(), "date", term158135);
        setByteField(term158139, term158139.getClass(), "hour", (byte) 0);
        setByteField(term158139, term158139.getClass(), "minute", (byte) 44);
        setByteField(term158139, term158139.getClass(), "second", (byte) 0);
        setIntField(term158139, term158139.getClass(), "nano", 108509);
        setField(term158134, term158134.getClass(), "time", term158139);
        setField(term158108, term158108.getClass(), "accessTime", term158134);
        setField(term158106, term158106.getClass(), "card", term158108);
        setField(term158106, term158106.getClass(), "userName", "kVqQcPdrWQ");
        setIntField(term158106, term158106.getClass(), "isNetMember", -579526757);
        setIntField(term158106, term158106.getClass(), "iconId", 1833184694);
        setIntField(term158106, term158106.getClass(), "plateId", 743393064);
        setIntField(term158106, term158106.getClass(), "titleId", -1134463597);
        setIntField(term158106, term158106.getClass(), "partnerId", 1984180612);
        setIntField(term158106, term158106.getClass(), "frameId", 1176733985);
        setIntField(term158106, term158106.getClass(), "selectMapId", -1966919914);
        setIntField(term158106, term158106.getClass(), "totalAwake", 153319034);
        setIntField(term158106, term158106.getClass(), "gradeRating", 60632310);
        setIntField(term158106, term158106.getClass(), "musicRating", -630247452);
        setIntField(term158106, term158106.getClass(), "playerRating", 1613548595);
        setIntField(term158106, term158106.getClass(), "highestRating", -277642697);
        setIntField(term158106, term158106.getClass(), "gradeRank", 1749853603);
        setIntField(term158106, term158106.getClass(), "classRank", 318642073);
        setIntField(term158106, term158106.getClass(), "courseRank", 402336735);
        setField(term158106, term158106.getClass(), "charaSlot", term158171);
        setField(term158106, term158106.getClass(), "charaLockSlot", term158183);
        setLongField(term158106, term158106.getClass(), "contentBit", 2168259007750328884L);
        setIntField(term158106, term158106.getClass(), "playCount", 1534581521);
        setField(term158106, term158106.getClass(), "eventWatchedDate", "jmaWVrOPqd");
        setField(term158106, term158106.getClass(), "lastGameId", "ELKzlCkmvl");
        setField(term158106, term158106.getClass(), "lastRomVersion", "eauSDrBART");
        setField(term158106, term158106.getClass(), "lastDataVersion", "wQkVWnwEaO");
        setField(term158106, term158106.getClass(), "lastLoginDate", "LKHBXQFtrr");
        setField(term158106, term158106.getClass(), "lastPlayDate", "CjcpiNwKbz");
        setIntField(term158106, term158106.getClass(), "lastPlayCredit", 683825505);
        setIntField(term158106, term158106.getClass(), "lastPlayMode", -874006328);
        setIntField(term158106, term158106.getClass(), "lastPlaceId", 331812569);
        setField(term158106, term158106.getClass(), "lastPlaceName", "nvWozUjsOS");
        setIntField(term158106, term158106.getClass(), "lastAllNetId", -694038544);
        setIntField(term158106, term158106.getClass(), "lastRegionId", -371046864);
        setField(term158106, term158106.getClass(), "lastRegionName", "vauQxLhXGi");
        setField(term158106, term158106.getClass(), "lastClientId", "GGajMblmCM");
        setField(term158106, term158106.getClass(), "lastCountryCode", "upFSnPbYis");
        setIntField(term158106, term158106.getClass(), "lastSelectEMoney", 1895958176);
        setIntField(term158106, term158106.getClass(), "lastSelectTicket", -344909600);
        setIntField(term158106, term158106.getClass(), "lastSelectCourse", 377838898);
        setIntField(term158106, term158106.getClass(), "lastCountCourse", 415407227);
        setField(term158106, term158106.getClass(), "firstGameId", "lFtqkraCAA");
        setField(term158106, term158106.getClass(), "firstRomVersion", "JXZfilbpmu");
        setField(term158106, term158106.getClass(), "firstDataVersion", "ZOCWqGoFBI");
        setField(term158106, term158106.getClass(), "firstPlayDate", "jZceqvdJOm");
        setField(term158106, term158106.getClass(), "compatibleCmVersion", "wMNDbrWUjd");
        setField(term158106, term158106.getClass(), "dailyBonusDate", "VkZrLGHKUu");
        setField(term158106, term158106.getClass(), "dailyCourseBonusDate", "pFLsnHtjQL");
        setField(term158106, term158106.getClass(), "lastPairLoginDate", "QCZRKLJKNK");
        setField(term158106, term158106.getClass(), "lastTrialPlayDate", "GhzRdsEUeK");
        setIntField(term158106, term158106.getClass(), "playVsCount", 1612361187);
        setIntField(term158106, term158106.getClass(), "playSyncCount", 1325455005);
        setIntField(term158106, term158106.getClass(), "winCount", -1370913089);
        setIntField(term158106, term158106.getClass(), "helpCount", -891285090);
        setIntField(term158106, term158106.getClass(), "comboCount", -351219934);
        setLongField(term158106, term158106.getClass(), "totalDeluxscore", -631251085590727632L);
        setLongField(term158106, term158106.getClass(), "totalBasicDeluxscore", 4565378783550338035L);
        setLongField(term158106, term158106.getClass(), "totalAdvancedDeluxscore", -2581868949144490049L);
        setLongField(term158106, term158106.getClass(), "totalExpertDeluxscore", 2516357507490078047L);
        setLongField(term158106, term158106.getClass(), "totalMasterDeluxscore", -6072598156864132387L);
        setLongField(term158106, term158106.getClass(), "totalReMasterDeluxscore", 7650569193474050985L);
        setIntField(term158106, term158106.getClass(), "totalSync", -925647425);
        setIntField(term158106, term158106.getClass(), "totalBasicSync", 1341898586);
        setIntField(term158106, term158106.getClass(), "totalAdvancedSync", -1763289432);
        setIntField(term158106, term158106.getClass(), "totalExpertSync", 882092074);
        setIntField(term158106, term158106.getClass(), "totalMasterSync", -705066137);
        setIntField(term158106, term158106.getClass(), "totalReMasterSync", -454954694);
        setLongField(term158106, term158106.getClass(), "totalAchievement", -829914049505547750L);
        setLongField(term158106, term158106.getClass(), "totalBasicAchievement", 8139814441817619312L);
        setLongField(term158106, term158106.getClass(), "totalAdvancedAchievement", -3769068841153313601L);
        setLongField(term158106, term158106.getClass(), "totalExpertAchievement", 620059637779482983L);
        setLongField(term158106, term158106.getClass(), "totalMasterAchievement", -2585664336595587057L);
        setLongField(term158106, term158106.getClass(), "totalReMasterAchievement", 708577904419371317L);
        setLongField(term158106, term158106.getClass(), "playerOldRating", -2690892774856443185L);
        setLongField(term158106, term158106.getClass(), "playerNewRating", 5840859821340657308L);
        setIntField(term158106, term158106.getClass(), "banState", -473778335);
        setLongField(term158106, term158106.getClass(), "dateTime", -2964890560184632056L);
        setField(term158104, term158104.getClass(), "user", term158106);
        setIntField(term158104, term158104.getClass(), "selectMusicId", -1516379970);
        setIntField(term158104, term158104.getClass(), "selectDifficultyId", -2138200889);
        setIntField(term158104, term158104.getClass(), "categoryIndex", -510919719);
        setIntField(term158104, term158104.getClass(), "musicIndex", 1116939662);
        setIntField(term158104, term158104.getClass(), "extraFlag", 1460432517);
        setIntField(term158104, term158104.getClass(), "selectScoreType", -1565303291);
        setLongField(term158104, term158104.getClass(), "extendContentBit", 6284569223648453852L);
        setBooleanField(term158104, term158104.getClass(), "isPhotoAgree", false);
        setBooleanField(term158104, term158104.getClass(), "isGotoCodeRead", false);
        setBooleanField(term158104, term158104.getClass(), "selectResultDetails", false);
        setIntField(term158104, term158104.getClass(), "sortCategorySetting", -2061583605);
        setIntField(term158104, term158104.getClass(), "sortMusicSetting", -1469827981);
        setField(term158104, term158104.getClass(), "selectedCardList", term158465);
        setField(term158104, term158104.getClass(), "encountMapNpcList", term158479);
        term158483 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term158483;
        callMethod(klass, "setGotoCodeRead", argTypes, term158104, args);
    }

};


