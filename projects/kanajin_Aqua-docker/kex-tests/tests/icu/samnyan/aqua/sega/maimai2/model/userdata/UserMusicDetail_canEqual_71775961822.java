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

public class UserMusicDetail_canEqual_71775961822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68275;
     Object term68650;

    public UserMusicDetail_canEqual_71775961822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68281 = new Long(1215116475929634177L);
        Integer term68344 = new Integer(320739944);
        Integer term68346 = new Integer(760218111);
        Integer term68348 = new Integer(-1986366126);
        Integer term68350 = new Integer(-1963228619);
        Integer term68352 = new Integer(-709868952);
        Integer term68354 = new Integer(847207929);
        Integer term68356 = new Integer(-1665928103);
        Integer term68358 = new Integer(1574458332);
        ArrayList term68342 = new ArrayList();
        ((ArrayList) term68342).add(term68344);
        ((ArrayList) term68342).add(term68346);
        ((ArrayList) term68342).add(term68348);
        ((ArrayList) term68342).add(term68350);
        ((ArrayList) term68342).add(term68352);
        ((ArrayList) term68342).add(term68354);
        ((ArrayList) term68342).add(term68356);
        ((ArrayList) term68342).add(term68358);
        Integer term68364 = new Integer(-975856245);
        Integer term68366 = new Integer(-1023366103);
        Integer term68368 = new Integer(81427089);
        Integer term68370 = new Integer(755951489);
        Integer term68372 = new Integer(1175146356);
        ArrayList term68362 = new ArrayList();
        ((ArrayList) term68362).add(term68364);
        ((ArrayList) term68362).add(term68366);
        ((ArrayList) term68362).add(term68368);
        ((ArrayList) term68362).add(term68370);
        ((ArrayList) term68362).add(term68372);
        term68275 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term68277 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term68279 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term68295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68300 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68310 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term68275, term68275.getClass(), "id", -9007332134350463845L);
        setLongField(term68277, term68277.getClass(), "id", 8545694832530342054L);
        setLongField(term68279, term68279.getClass(), "id", -2935013818936662643L);
        setField(term68279, term68279.getClass(), "extId", term68281);
        setField(term68279, term68279.getClass(), "luid", "RVQbteztJx");
        setIntField(term68296, term68296.getClass(), "year", 2018);
        setShortField(term68296, term68296.getClass(), "month", (short) 5);
        setShortField(term68296, term68296.getClass(), "day", (short) 13);
        setField(term68295, term68295.getClass(), "date", term68296);
        setByteField(term68300, term68300.getClass(), "hour", (byte) 0);
        setByteField(term68300, term68300.getClass(), "minute", (byte) 47);
        setByteField(term68300, term68300.getClass(), "second", (byte) 45);
        setIntField(term68300, term68300.getClass(), "nano", 10058361);
        setField(term68295, term68295.getClass(), "time", term68300);
        setField(term68279, term68279.getClass(), "registerTime", term68295);
        setIntField(term68306, term68306.getClass(), "year", 2014);
        setShortField(term68306, term68306.getClass(), "month", (short) 6);
        setShortField(term68306, term68306.getClass(), "day", (short) 11);
        setField(term68305, term68305.getClass(), "date", term68306);
        setByteField(term68310, term68310.getClass(), "hour", (byte) 8);
        setByteField(term68310, term68310.getClass(), "minute", (byte) 55);
        setByteField(term68310, term68310.getClass(), "second", (byte) 58);
        setIntField(term68310, term68310.getClass(), "nano", 376244535);
        setField(term68305, term68305.getClass(), "time", term68310);
        setField(term68279, term68279.getClass(), "accessTime", term68305);
        setField(term68277, term68277.getClass(), "card", term68279);
        setField(term68277, term68277.getClass(), "userName", "yjmUdvwSdd");
        setIntField(term68277, term68277.getClass(), "isNetMember", -993930773);
        setIntField(term68277, term68277.getClass(), "iconId", 1436841795);
        setIntField(term68277, term68277.getClass(), "plateId", 248838167);
        setIntField(term68277, term68277.getClass(), "titleId", 1957931763);
        setIntField(term68277, term68277.getClass(), "partnerId", -845283401);
        setIntField(term68277, term68277.getClass(), "frameId", 1423298146);
        setIntField(term68277, term68277.getClass(), "selectMapId", 168549967);
        setIntField(term68277, term68277.getClass(), "totalAwake", 1631903694);
        setIntField(term68277, term68277.getClass(), "gradeRating", 483088872);
        setIntField(term68277, term68277.getClass(), "musicRating", 157859356);
        setIntField(term68277, term68277.getClass(), "playerRating", 1788509099);
        setIntField(term68277, term68277.getClass(), "highestRating", -407602685);
        setIntField(term68277, term68277.getClass(), "gradeRank", -484929244);
        setIntField(term68277, term68277.getClass(), "classRank", -1316734168);
        setIntField(term68277, term68277.getClass(), "courseRank", 1973373652);
        setField(term68277, term68277.getClass(), "charaSlot", term68342);
        setField(term68277, term68277.getClass(), "charaLockSlot", term68362);
        setLongField(term68277, term68277.getClass(), "contentBit", -8356746197417996521L);
        setIntField(term68277, term68277.getClass(), "playCount", 1574921912);
        setField(term68277, term68277.getClass(), "eventWatchedDate", "COsGswsrtI");
        setField(term68277, term68277.getClass(), "lastGameId", "ebUWnoVDmk");
        setField(term68277, term68277.getClass(), "lastRomVersion", "wCcojFgWKb");
        setField(term68277, term68277.getClass(), "lastDataVersion", "iHtqLPNWTt");
        setField(term68277, term68277.getClass(), "lastLoginDate", "TQgECVDMEf");
        setField(term68277, term68277.getClass(), "lastPlayDate", "KIBOVYItqe");
        setIntField(term68277, term68277.getClass(), "lastPlayCredit", -1117910274);
        setIntField(term68277, term68277.getClass(), "lastPlayMode", 759727183);
        setIntField(term68277, term68277.getClass(), "lastPlaceId", 383595991);
        setField(term68277, term68277.getClass(), "lastPlaceName", "GUztJeVeCc");
        setIntField(term68277, term68277.getClass(), "lastAllNetId", 1736367900);
        setIntField(term68277, term68277.getClass(), "lastRegionId", -1181229958);
        setField(term68277, term68277.getClass(), "lastRegionName", "YNXFGgstqj");
        setField(term68277, term68277.getClass(), "lastClientId", "xZTWqxWsAc");
        setField(term68277, term68277.getClass(), "lastCountryCode", "sWchglYniO");
        setIntField(term68277, term68277.getClass(), "lastSelectEMoney", -341744470);
        setIntField(term68277, term68277.getClass(), "lastSelectTicket", -1112768944);
        setIntField(term68277, term68277.getClass(), "lastSelectCourse", -1300523076);
        setIntField(term68277, term68277.getClass(), "lastCountCourse", -1136236336);
        setField(term68277, term68277.getClass(), "firstGameId", "lohegbXyjA");
        setField(term68277, term68277.getClass(), "firstRomVersion", "HlddItIexw");
        setField(term68277, term68277.getClass(), "firstDataVersion", "HnpLvemmRI");
        setField(term68277, term68277.getClass(), "firstPlayDate", "dHrIcaTbcS");
        setField(term68277, term68277.getClass(), "compatibleCmVersion", "tAqyToqusS");
        setField(term68277, term68277.getClass(), "dailyBonusDate", "MwiFLgdSDA");
        setField(term68277, term68277.getClass(), "dailyCourseBonusDate", "VhnistEcCA");
        setField(term68277, term68277.getClass(), "lastPairLoginDate", "hlPKLObFBU");
        setField(term68277, term68277.getClass(), "lastTrialPlayDate", "oNGVAyjCob");
        setIntField(term68277, term68277.getClass(), "playVsCount", 935191824);
        setIntField(term68277, term68277.getClass(), "playSyncCount", 290423749);
        setIntField(term68277, term68277.getClass(), "winCount", -2055991020);
        setIntField(term68277, term68277.getClass(), "helpCount", 2087954544);
        setIntField(term68277, term68277.getClass(), "comboCount", 885858505);
        setLongField(term68277, term68277.getClass(), "totalDeluxscore", 1588756868689872678L);
        setLongField(term68277, term68277.getClass(), "totalBasicDeluxscore", 2841025204772034361L);
        setLongField(term68277, term68277.getClass(), "totalAdvancedDeluxscore", -6951863671075383168L);
        setLongField(term68277, term68277.getClass(), "totalExpertDeluxscore", 444711052508404757L);
        setLongField(term68277, term68277.getClass(), "totalMasterDeluxscore", -4433754356855281318L);
        setLongField(term68277, term68277.getClass(), "totalReMasterDeluxscore", -8219871028565555567L);
        setIntField(term68277, term68277.getClass(), "totalSync", -178058161);
        setIntField(term68277, term68277.getClass(), "totalBasicSync", -1275142809);
        setIntField(term68277, term68277.getClass(), "totalAdvancedSync", 1175936070);
        setIntField(term68277, term68277.getClass(), "totalExpertSync", -479776378);
        setIntField(term68277, term68277.getClass(), "totalMasterSync", 947385214);
        setIntField(term68277, term68277.getClass(), "totalReMasterSync", -76877870);
        setLongField(term68277, term68277.getClass(), "totalAchievement", -4664784590063321060L);
        setLongField(term68277, term68277.getClass(), "totalBasicAchievement", -8176783923061900011L);
        setLongField(term68277, term68277.getClass(), "totalAdvancedAchievement", -9018044396967594984L);
        setLongField(term68277, term68277.getClass(), "totalExpertAchievement", -545192431010524816L);
        setLongField(term68277, term68277.getClass(), "totalMasterAchievement", 6466572752098109458L);
        setLongField(term68277, term68277.getClass(), "totalReMasterAchievement", 2539855115472922877L);
        setLongField(term68277, term68277.getClass(), "playerOldRating", 2225205033924782338L);
        setLongField(term68277, term68277.getClass(), "playerNewRating", 7835393778718147329L);
        setIntField(term68277, term68277.getClass(), "banState", 2104799551);
        setLongField(term68277, term68277.getClass(), "dateTime", 2629509803227198743L);
        setField(term68275, term68275.getClass(), "user", term68277);
        setIntField(term68275, term68275.getClass(), "musicId", 1728341653);
        setIntField(term68275, term68275.getClass(), "level", 1063150462);
        setIntField(term68275, term68275.getClass(), "playCount", 1817004190);
        setIntField(term68275, term68275.getClass(), "achievement", -1901062134);
        setIntField(term68275, term68275.getClass(), "comboStatus", -1990968496);
        setIntField(term68275, term68275.getClass(), "syncStatus", -578225035);
        setIntField(term68275, term68275.getClass(), "deluxscoreMax", -1437822250);
        setIntField(term68275, term68275.getClass(), "scoreRank", -1551608541);
        term68650 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68650;
        callMethod(klass, "canEqual", argTypes, term68275, args);
    }

};


