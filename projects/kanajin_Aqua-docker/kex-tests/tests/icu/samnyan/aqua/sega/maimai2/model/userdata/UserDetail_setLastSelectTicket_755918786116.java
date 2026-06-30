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

public class UserDetail_setLastSelectTicket_755918786116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261022;
     Object term261363;

    public UserDetail_setLastSelectTicket_755918786116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term261026 = new Long(77619432202128806L);
        Integer term261089 = new Integer(-1401413822);
        ArrayList term261087 = new ArrayList();
        ((ArrayList) term261087).add(term261089);
        ArrayList term261093 = new ArrayList();
        term261022 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term261024 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term261040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term261050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261055 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term261022, term261022.getClass(), "id", -6057737828591869790L);
        setLongField(term261024, term261024.getClass(), "id", 4210765964459042476L);
        setField(term261024, term261024.getClass(), "extId", term261026);
        setField(term261024, term261024.getClass(), "luid", "RmkFdgzLOk");
        setIntField(term261041, term261041.getClass(), "year", 2013);
        setShortField(term261041, term261041.getClass(), "month", (short) 3);
        setShortField(term261041, term261041.getClass(), "day", (short) 23);
        setField(term261040, term261040.getClass(), "date", term261041);
        setByteField(term261045, term261045.getClass(), "hour", (byte) 11);
        setByteField(term261045, term261045.getClass(), "minute", (byte) 19);
        setByteField(term261045, term261045.getClass(), "second", (byte) 49);
        setIntField(term261045, term261045.getClass(), "nano", 671462460);
        setField(term261040, term261040.getClass(), "time", term261045);
        setField(term261024, term261024.getClass(), "registerTime", term261040);
        setIntField(term261051, term261051.getClass(), "year", 2025);
        setShortField(term261051, term261051.getClass(), "month", (short) 5);
        setShortField(term261051, term261051.getClass(), "day", (short) 12);
        setField(term261050, term261050.getClass(), "date", term261051);
        setByteField(term261055, term261055.getClass(), "hour", (byte) 14);
        setByteField(term261055, term261055.getClass(), "minute", (byte) 27);
        setByteField(term261055, term261055.getClass(), "second", (byte) 18);
        setIntField(term261055, term261055.getClass(), "nano", 530044969);
        setField(term261050, term261050.getClass(), "time", term261055);
        setField(term261024, term261024.getClass(), "accessTime", term261050);
        setField(term261022, term261022.getClass(), "card", term261024);
        setField(term261022, term261022.getClass(), "userName", "MbeNzUVsCl");
        setIntField(term261022, term261022.getClass(), "isNetMember", -1881174954);
        setIntField(term261022, term261022.getClass(), "iconId", 1293357935);
        setIntField(term261022, term261022.getClass(), "plateId", -2045621604);
        setIntField(term261022, term261022.getClass(), "titleId", -1766346007);
        setIntField(term261022, term261022.getClass(), "partnerId", 2046694425);
        setIntField(term261022, term261022.getClass(), "frameId", 1066418317);
        setIntField(term261022, term261022.getClass(), "selectMapId", 298705041);
        setIntField(term261022, term261022.getClass(), "totalAwake", -840203357);
        setIntField(term261022, term261022.getClass(), "gradeRating", -352051215);
        setIntField(term261022, term261022.getClass(), "musicRating", -1979481664);
        setIntField(term261022, term261022.getClass(), "playerRating", -365906918);
        setIntField(term261022, term261022.getClass(), "highestRating", 2117549900);
        setIntField(term261022, term261022.getClass(), "gradeRank", -1249760569);
        setIntField(term261022, term261022.getClass(), "classRank", -363328051);
        setIntField(term261022, term261022.getClass(), "courseRank", 1705359533);
        setField(term261022, term261022.getClass(), "charaSlot", term261087);
        setField(term261022, term261022.getClass(), "charaLockSlot", term261093);
        setLongField(term261022, term261022.getClass(), "contentBit", 982254682245693951L);
        setIntField(term261022, term261022.getClass(), "playCount", -1282832295);
        setField(term261022, term261022.getClass(), "eventWatchedDate", "JrFwmRIxXJ");
        setField(term261022, term261022.getClass(), "lastGameId", "CBPHkMUpDJ");
        setField(term261022, term261022.getClass(), "lastRomVersion", "kcrVudpPVv");
        setField(term261022, term261022.getClass(), "lastDataVersion", "fHMfHuQbLa");
        setField(term261022, term261022.getClass(), "lastLoginDate", "OFdIUrEOJR");
        setField(term261022, term261022.getClass(), "lastPlayDate", "xUODPydxaT");
        setIntField(term261022, term261022.getClass(), "lastPlayCredit", -1520422396);
        setIntField(term261022, term261022.getClass(), "lastPlayMode", 1249417434);
        setIntField(term261022, term261022.getClass(), "lastPlaceId", -993162730);
        setField(term261022, term261022.getClass(), "lastPlaceName", "EdjuGrPKel");
        setIntField(term261022, term261022.getClass(), "lastAllNetId", -1006811892);
        setIntField(term261022, term261022.getClass(), "lastRegionId", -1072459125);
        setField(term261022, term261022.getClass(), "lastRegionName", "xKRCOGzNgc");
        setField(term261022, term261022.getClass(), "lastClientId", "JTfrTZUkVR");
        setField(term261022, term261022.getClass(), "lastCountryCode", "klkctrXEId");
        setIntField(term261022, term261022.getClass(), "lastSelectEMoney", -994729899);
        setIntField(term261022, term261022.getClass(), "lastSelectTicket", 246912139);
        setIntField(term261022, term261022.getClass(), "lastSelectCourse", -1197365259);
        setIntField(term261022, term261022.getClass(), "lastCountCourse", -350142230);
        setField(term261022, term261022.getClass(), "firstGameId", "HITkgFdUxC");
        setField(term261022, term261022.getClass(), "firstRomVersion", "JtTgctnzIb");
        setField(term261022, term261022.getClass(), "firstDataVersion", "jkqncveFue");
        setField(term261022, term261022.getClass(), "firstPlayDate", "ORAFZEKabw");
        setField(term261022, term261022.getClass(), "compatibleCmVersion", "lNHeCcQUrM");
        setField(term261022, term261022.getClass(), "dailyBonusDate", "xDzfsTlPyO");
        setField(term261022, term261022.getClass(), "dailyCourseBonusDate", "xtNbDPazRs");
        setField(term261022, term261022.getClass(), "lastPairLoginDate", "STfGRumXvX");
        setField(term261022, term261022.getClass(), "lastTrialPlayDate", "qoMGJyerSD");
        setIntField(term261022, term261022.getClass(), "playVsCount", 1873154325);
        setIntField(term261022, term261022.getClass(), "playSyncCount", 368912893);
        setIntField(term261022, term261022.getClass(), "winCount", 1352383675);
        setIntField(term261022, term261022.getClass(), "helpCount", 579784907);
        setIntField(term261022, term261022.getClass(), "comboCount", -1880511554);
        setLongField(term261022, term261022.getClass(), "totalDeluxscore", -8038435025744420397L);
        setLongField(term261022, term261022.getClass(), "totalBasicDeluxscore", -4615217324255547254L);
        setLongField(term261022, term261022.getClass(), "totalAdvancedDeluxscore", 3270475489346331663L);
        setLongField(term261022, term261022.getClass(), "totalExpertDeluxscore", -5064347581830338455L);
        setLongField(term261022, term261022.getClass(), "totalMasterDeluxscore", -7995043695635162874L);
        setLongField(term261022, term261022.getClass(), "totalReMasterDeluxscore", -5673802841866938555L);
        setIntField(term261022, term261022.getClass(), "totalSync", -1830283088);
        setIntField(term261022, term261022.getClass(), "totalBasicSync", -145916644);
        setIntField(term261022, term261022.getClass(), "totalAdvancedSync", 1008205744);
        setIntField(term261022, term261022.getClass(), "totalExpertSync", -964506776);
        setIntField(term261022, term261022.getClass(), "totalMasterSync", -548169971);
        setIntField(term261022, term261022.getClass(), "totalReMasterSync", 376091185);
        setLongField(term261022, term261022.getClass(), "totalAchievement", -4871025584832147125L);
        setLongField(term261022, term261022.getClass(), "totalBasicAchievement", 8966624073715829292L);
        setLongField(term261022, term261022.getClass(), "totalAdvancedAchievement", 1390040075508940002L);
        setLongField(term261022, term261022.getClass(), "totalExpertAchievement", 2410860596265244087L);
        setLongField(term261022, term261022.getClass(), "totalMasterAchievement", -3290649413333693949L);
        setLongField(term261022, term261022.getClass(), "totalReMasterAchievement", 2974647091084418159L);
        setLongField(term261022, term261022.getClass(), "playerOldRating", -470212015053263842L);
        setLongField(term261022, term261022.getClass(), "playerNewRating", -6901065091973326996L);
        setIntField(term261022, term261022.getClass(), "banState", 1059436255);
        setLongField(term261022, term261022.getClass(), "dateTime", -741174243548147937L);
        term261363 = new Integer(-709660030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term261363;
        callMethod(klass, "setLastSelectTicket", argTypes, term261022, args);
    }

};


