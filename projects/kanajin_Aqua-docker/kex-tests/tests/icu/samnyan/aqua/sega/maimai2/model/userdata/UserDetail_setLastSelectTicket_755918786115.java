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

public class UserDetail_setLastSelectTicket_755918786115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260967;
     Object term261308;

    public UserDetail_setLastSelectTicket_755918786115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term260971 = new Long(77619432202128806L);
        Integer term261034 = new Integer(-1401413822);
        ArrayList term261032 = new ArrayList();
        ((ArrayList) term261032).add(term261034);
        ArrayList term261038 = new ArrayList();
        term260967 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term260969 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term260985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260990 = newInstance(Class.forName("java.time.LocalTime"));
        Object term260995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261000 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term260967, term260967.getClass(), "id", -6057737828591869790L);
        setLongField(term260969, term260969.getClass(), "id", 4210765964459042476L);
        setField(term260969, term260969.getClass(), "extId", term260971);
        setField(term260969, term260969.getClass(), "luid", "RmkFdgzLOk");
        setIntField(term260986, term260986.getClass(), "year", 2013);
        setShortField(term260986, term260986.getClass(), "month", (short) 3);
        setShortField(term260986, term260986.getClass(), "day", (short) 23);
        setField(term260985, term260985.getClass(), "date", term260986);
        setByteField(term260990, term260990.getClass(), "hour", (byte) 11);
        setByteField(term260990, term260990.getClass(), "minute", (byte) 19);
        setByteField(term260990, term260990.getClass(), "second", (byte) 49);
        setIntField(term260990, term260990.getClass(), "nano", 671462460);
        setField(term260985, term260985.getClass(), "time", term260990);
        setField(term260969, term260969.getClass(), "registerTime", term260985);
        setIntField(term260996, term260996.getClass(), "year", 2025);
        setShortField(term260996, term260996.getClass(), "month", (short) 5);
        setShortField(term260996, term260996.getClass(), "day", (short) 12);
        setField(term260995, term260995.getClass(), "date", term260996);
        setByteField(term261000, term261000.getClass(), "hour", (byte) 14);
        setByteField(term261000, term261000.getClass(), "minute", (byte) 27);
        setByteField(term261000, term261000.getClass(), "second", (byte) 18);
        setIntField(term261000, term261000.getClass(), "nano", 530044969);
        setField(term260995, term260995.getClass(), "time", term261000);
        setField(term260969, term260969.getClass(), "accessTime", term260995);
        setField(term260967, term260967.getClass(), "card", term260969);
        setField(term260967, term260967.getClass(), "userName", "MbeNzUVsCl");
        setIntField(term260967, term260967.getClass(), "isNetMember", -1881174954);
        setIntField(term260967, term260967.getClass(), "iconId", 1293357935);
        setIntField(term260967, term260967.getClass(), "plateId", -2045621604);
        setIntField(term260967, term260967.getClass(), "titleId", -1766346007);
        setIntField(term260967, term260967.getClass(), "partnerId", 2046694425);
        setIntField(term260967, term260967.getClass(), "frameId", 1066418317);
        setIntField(term260967, term260967.getClass(), "selectMapId", 298705041);
        setIntField(term260967, term260967.getClass(), "totalAwake", -840203357);
        setIntField(term260967, term260967.getClass(), "gradeRating", -352051215);
        setIntField(term260967, term260967.getClass(), "musicRating", -1979481664);
        setIntField(term260967, term260967.getClass(), "playerRating", -365906918);
        setIntField(term260967, term260967.getClass(), "highestRating", 2117549900);
        setIntField(term260967, term260967.getClass(), "gradeRank", -1249760569);
        setIntField(term260967, term260967.getClass(), "classRank", -363328051);
        setIntField(term260967, term260967.getClass(), "courseRank", 1705359533);
        setField(term260967, term260967.getClass(), "charaSlot", term261032);
        setField(term260967, term260967.getClass(), "charaLockSlot", term261038);
        setLongField(term260967, term260967.getClass(), "contentBit", 982254682245693951L);
        setIntField(term260967, term260967.getClass(), "playCount", -1282832295);
        setField(term260967, term260967.getClass(), "eventWatchedDate", "JrFwmRIxXJ");
        setField(term260967, term260967.getClass(), "lastGameId", "CBPHkMUpDJ");
        setField(term260967, term260967.getClass(), "lastRomVersion", "kcrVudpPVv");
        setField(term260967, term260967.getClass(), "lastDataVersion", "fHMfHuQbLa");
        setField(term260967, term260967.getClass(), "lastLoginDate", "OFdIUrEOJR");
        setField(term260967, term260967.getClass(), "lastPlayDate", "xUODPydxaT");
        setIntField(term260967, term260967.getClass(), "lastPlayCredit", -1520422396);
        setIntField(term260967, term260967.getClass(), "lastPlayMode", 1249417434);
        setIntField(term260967, term260967.getClass(), "lastPlaceId", -993162730);
        setField(term260967, term260967.getClass(), "lastPlaceName", "EdjuGrPKel");
        setIntField(term260967, term260967.getClass(), "lastAllNetId", -1006811892);
        setIntField(term260967, term260967.getClass(), "lastRegionId", -1072459125);
        setField(term260967, term260967.getClass(), "lastRegionName", "xKRCOGzNgc");
        setField(term260967, term260967.getClass(), "lastClientId", "JTfrTZUkVR");
        setField(term260967, term260967.getClass(), "lastCountryCode", "klkctrXEId");
        setIntField(term260967, term260967.getClass(), "lastSelectEMoney", -994729899);
        setIntField(term260967, term260967.getClass(), "lastSelectTicket", 246912139);
        setIntField(term260967, term260967.getClass(), "lastSelectCourse", -1197365259);
        setIntField(term260967, term260967.getClass(), "lastCountCourse", -350142230);
        setField(term260967, term260967.getClass(), "firstGameId", "HITkgFdUxC");
        setField(term260967, term260967.getClass(), "firstRomVersion", "JtTgctnzIb");
        setField(term260967, term260967.getClass(), "firstDataVersion", "jkqncveFue");
        setField(term260967, term260967.getClass(), "firstPlayDate", "ORAFZEKabw");
        setField(term260967, term260967.getClass(), "compatibleCmVersion", "lNHeCcQUrM");
        setField(term260967, term260967.getClass(), "dailyBonusDate", "xDzfsTlPyO");
        setField(term260967, term260967.getClass(), "dailyCourseBonusDate", "xtNbDPazRs");
        setField(term260967, term260967.getClass(), "lastPairLoginDate", "STfGRumXvX");
        setField(term260967, term260967.getClass(), "lastTrialPlayDate", "qoMGJyerSD");
        setIntField(term260967, term260967.getClass(), "playVsCount", 1873154325);
        setIntField(term260967, term260967.getClass(), "playSyncCount", 368912893);
        setIntField(term260967, term260967.getClass(), "winCount", 1352383675);
        setIntField(term260967, term260967.getClass(), "helpCount", 579784907);
        setIntField(term260967, term260967.getClass(), "comboCount", -1880511554);
        setLongField(term260967, term260967.getClass(), "totalDeluxscore", -8038435025744420397L);
        setLongField(term260967, term260967.getClass(), "totalBasicDeluxscore", -4615217324255547254L);
        setLongField(term260967, term260967.getClass(), "totalAdvancedDeluxscore", 3270475489346331663L);
        setLongField(term260967, term260967.getClass(), "totalExpertDeluxscore", -5064347581830338455L);
        setLongField(term260967, term260967.getClass(), "totalMasterDeluxscore", -7995043695635162874L);
        setLongField(term260967, term260967.getClass(), "totalReMasterDeluxscore", -5673802841866938555L);
        setIntField(term260967, term260967.getClass(), "totalSync", -1830283088);
        setIntField(term260967, term260967.getClass(), "totalBasicSync", -145916644);
        setIntField(term260967, term260967.getClass(), "totalAdvancedSync", 1008205744);
        setIntField(term260967, term260967.getClass(), "totalExpertSync", -964506776);
        setIntField(term260967, term260967.getClass(), "totalMasterSync", -548169971);
        setIntField(term260967, term260967.getClass(), "totalReMasterSync", 376091185);
        setLongField(term260967, term260967.getClass(), "totalAchievement", -4871025584832147125L);
        setLongField(term260967, term260967.getClass(), "totalBasicAchievement", 8966624073715829292L);
        setLongField(term260967, term260967.getClass(), "totalAdvancedAchievement", 1390040075508940002L);
        setLongField(term260967, term260967.getClass(), "totalExpertAchievement", 2410860596265244087L);
        setLongField(term260967, term260967.getClass(), "totalMasterAchievement", -3290649413333693949L);
        setLongField(term260967, term260967.getClass(), "totalReMasterAchievement", 2974647091084418159L);
        setLongField(term260967, term260967.getClass(), "playerOldRating", -470212015053263842L);
        setLongField(term260967, term260967.getClass(), "playerNewRating", -6901065091973326996L);
        setIntField(term260967, term260967.getClass(), "banState", 1059436255);
        setLongField(term260967, term260967.getClass(), "dateTime", -741174243548147937L);
        term261308 = new Integer(-709660030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term261308;
        callMethod(klass, "setLastSelectTicket", argTypes, term260967, args);
    }

};


