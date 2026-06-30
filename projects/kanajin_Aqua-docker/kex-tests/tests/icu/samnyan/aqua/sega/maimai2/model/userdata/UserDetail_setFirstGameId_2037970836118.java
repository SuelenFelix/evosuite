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

public class UserDetail_setFirstGameId_2037970836118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4296781;

    public UserDetail_setFirstGameId_2037970836118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4296785 = new Long(7497491354611378876L);
        ArrayList term4296846 = new ArrayList();
        Integer term4296852 = new Integer(106608060);
        Integer term4296854 = new Integer(-97528141);
        ArrayList term4296850 = new ArrayList();
        ((ArrayList) term4296850).add(term4296852);
        ((ArrayList) term4296850).add(term4296854);
        term4296781 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4296783 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4296799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4296800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4296804 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4296809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4296810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4296814 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4296781, term4296781.getClass(), "id", -1316857827638715486L);
        setLongField(term4296783, term4296783.getClass(), "id", 149952159449234539L);
        setField(term4296783, term4296783.getClass(), "extId", term4296785);
        setField(term4296783, term4296783.getClass(), "luid", "oyzjbuapof");
        setIntField(term4296800, term4296800.getClass(), "year", 2024);
        setShortField(term4296800, term4296800.getClass(), "month", (short) 3);
        setShortField(term4296800, term4296800.getClass(), "day", (short) 26);
        setField(term4296799, term4296799.getClass(), "date", term4296800);
        setByteField(term4296804, term4296804.getClass(), "hour", (byte) 18);
        setByteField(term4296804, term4296804.getClass(), "minute", (byte) 24);
        setByteField(term4296804, term4296804.getClass(), "second", (byte) 3);
        setIntField(term4296804, term4296804.getClass(), "nano", 606887323);
        setField(term4296799, term4296799.getClass(), "time", term4296804);
        setField(term4296783, term4296783.getClass(), "registerTime", term4296799);
        setIntField(term4296810, term4296810.getClass(), "year", 2018);
        setShortField(term4296810, term4296810.getClass(), "month", (short) 6);
        setShortField(term4296810, term4296810.getClass(), "day", (short) 17);
        setField(term4296809, term4296809.getClass(), "date", term4296810);
        setByteField(term4296814, term4296814.getClass(), "hour", (byte) 12);
        setByteField(term4296814, term4296814.getClass(), "minute", (byte) 7);
        setByteField(term4296814, term4296814.getClass(), "second", (byte) 8);
        setIntField(term4296814, term4296814.getClass(), "nano", 116317318);
        setField(term4296809, term4296809.getClass(), "time", term4296814);
        setField(term4296783, term4296783.getClass(), "accessTime", term4296809);
        setField(term4296781, term4296781.getClass(), "card", term4296783);
        setField(term4296781, term4296781.getClass(), "userName", "nCHooXyfzO");
        setIntField(term4296781, term4296781.getClass(), "isNetMember", -428813539);
        setIntField(term4296781, term4296781.getClass(), "iconId", 990393112);
        setIntField(term4296781, term4296781.getClass(), "plateId", -996582289);
        setIntField(term4296781, term4296781.getClass(), "titleId", 1704905329);
        setIntField(term4296781, term4296781.getClass(), "partnerId", -1920075105);
        setIntField(term4296781, term4296781.getClass(), "frameId", 603031770);
        setIntField(term4296781, term4296781.getClass(), "selectMapId", 1347196037);
        setIntField(term4296781, term4296781.getClass(), "totalAwake", 317706120);
        setIntField(term4296781, term4296781.getClass(), "gradeRating", -514427605);
        setIntField(term4296781, term4296781.getClass(), "musicRating", 2024670968);
        setIntField(term4296781, term4296781.getClass(), "playerRating", 303459945);
        setIntField(term4296781, term4296781.getClass(), "highestRating", 644797292);
        setIntField(term4296781, term4296781.getClass(), "gradeRank", 1162560366);
        setIntField(term4296781, term4296781.getClass(), "classRank", -1422744591);
        setIntField(term4296781, term4296781.getClass(), "courseRank", 1323467310);
        setField(term4296781, term4296781.getClass(), "charaSlot", term4296846);
        setField(term4296781, term4296781.getClass(), "charaLockSlot", term4296850);
        setLongField(term4296781, term4296781.getClass(), "contentBit", 6924024456980819228L);
        setIntField(term4296781, term4296781.getClass(), "playCount", 1900767814);
        setField(term4296781, term4296781.getClass(), "eventWatchedDate", "PkShsmajWE");
        setField(term4296781, term4296781.getClass(), "lastGameId", "glUGRRSvAx");
        setField(term4296781, term4296781.getClass(), "lastRomVersion", "ubqKSqppEI");
        setField(term4296781, term4296781.getClass(), "lastDataVersion", "SboseCULUD");
        setField(term4296781, term4296781.getClass(), "lastLoginDate", "OSFLCxAPbI");
        setField(term4296781, term4296781.getClass(), "lastPlayDate", "iHNDrogBLU");
        setIntField(term4296781, term4296781.getClass(), "lastPlayCredit", -433709558);
        setIntField(term4296781, term4296781.getClass(), "lastPlayMode", -1784794024);
        setIntField(term4296781, term4296781.getClass(), "lastPlaceId", 256334641);
        setField(term4296781, term4296781.getClass(), "lastPlaceName", "QCYHtSXBCc");
        setIntField(term4296781, term4296781.getClass(), "lastAllNetId", 1013314617);
        setIntField(term4296781, term4296781.getClass(), "lastRegionId", -902350455);
        setField(term4296781, term4296781.getClass(), "lastRegionName", "CrTjCBwvqN");
        setField(term4296781, term4296781.getClass(), "lastClientId", "BcclgcXTNR");
        setField(term4296781, term4296781.getClass(), "lastCountryCode", "DKtVxZairU");
        setIntField(term4296781, term4296781.getClass(), "lastSelectEMoney", -316468812);
        setIntField(term4296781, term4296781.getClass(), "lastSelectTicket", -1960616156);
        setIntField(term4296781, term4296781.getClass(), "lastSelectCourse", 1881798890);
        setIntField(term4296781, term4296781.getClass(), "lastCountCourse", -850995826);
        setField(term4296781, term4296781.getClass(), "firstGameId", "HyIPdPBfaV");
        setField(term4296781, term4296781.getClass(), "firstRomVersion", "NgtoSZLphk");
        setField(term4296781, term4296781.getClass(), "firstDataVersion", "hKTZwKfSes");
        setField(term4296781, term4296781.getClass(), "firstPlayDate", "VpiqQCQSAB");
        setField(term4296781, term4296781.getClass(), "compatibleCmVersion", "LlVYfUpuvO");
        setField(term4296781, term4296781.getClass(), "dailyBonusDate", "mGcQdbccYC");
        setField(term4296781, term4296781.getClass(), "dailyCourseBonusDate", "bTdOwtgtIc");
        setField(term4296781, term4296781.getClass(), "lastPairLoginDate", "tbrpsMDMIP");
        setField(term4296781, term4296781.getClass(), "lastTrialPlayDate", "fEmOyOgfJb");
        setIntField(term4296781, term4296781.getClass(), "playVsCount", 1135201190);
        setIntField(term4296781, term4296781.getClass(), "playSyncCount", -1942449557);
        setIntField(term4296781, term4296781.getClass(), "winCount", 1488205634);
        setIntField(term4296781, term4296781.getClass(), "helpCount", -677115060);
        setIntField(term4296781, term4296781.getClass(), "comboCount", -1316272303);
        setLongField(term4296781, term4296781.getClass(), "totalDeluxscore", -5729269214118152002L);
        setLongField(term4296781, term4296781.getClass(), "totalBasicDeluxscore", 3203239222621153897L);
        setLongField(term4296781, term4296781.getClass(), "totalAdvancedDeluxscore", 8930615593830694823L);
        setLongField(term4296781, term4296781.getClass(), "totalExpertDeluxscore", -5142979074937371774L);
        setLongField(term4296781, term4296781.getClass(), "totalMasterDeluxscore", 8725360589708133417L);
        setLongField(term4296781, term4296781.getClass(), "totalReMasterDeluxscore", 3152870497797466976L);
        setIntField(term4296781, term4296781.getClass(), "totalSync", -1831875162);
        setIntField(term4296781, term4296781.getClass(), "totalBasicSync", -1646039694);
        setIntField(term4296781, term4296781.getClass(), "totalAdvancedSync", 1823313724);
        setIntField(term4296781, term4296781.getClass(), "totalExpertSync", 230879477);
        setIntField(term4296781, term4296781.getClass(), "totalMasterSync", -689882994);
        setIntField(term4296781, term4296781.getClass(), "totalReMasterSync", 861871415);
        setLongField(term4296781, term4296781.getClass(), "totalAchievement", 110468590067081741L);
        setLongField(term4296781, term4296781.getClass(), "totalBasicAchievement", 8081187238142534046L);
        setLongField(term4296781, term4296781.getClass(), "totalAdvancedAchievement", -851633486252705241L);
        setLongField(term4296781, term4296781.getClass(), "totalExpertAchievement", -4431841566869228963L);
        setLongField(term4296781, term4296781.getClass(), "totalMasterAchievement", 8693957029175938781L);
        setLongField(term4296781, term4296781.getClass(), "totalReMasterAchievement", 5249517800255459431L);
        setLongField(term4296781, term4296781.getClass(), "playerOldRating", 144618140002772201L);
        setLongField(term4296781, term4296781.getClass(), "playerNewRating", 1049911900428168598L);
        setIntField(term4296781, term4296781.getClass(), "banState", -659006966);
        setLongField(term4296781, term4296781.getClass(), "dateTime", -4170740078036374435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QEjszKAvNv";
        callMethod(klass, "setFirstGameId", argTypes, term4296781, args);
    }

};


