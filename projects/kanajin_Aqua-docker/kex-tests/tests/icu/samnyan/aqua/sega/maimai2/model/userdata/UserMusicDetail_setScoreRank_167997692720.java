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

public class UserMusicDetail_setScoreRank_167997692720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67112;
     Object term67481;

    public UserMusicDetail_setScoreRank_167997692720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67118 = new Long(7276637106827860087L);
        Integer term67181 = new Integer(1343432022);
        Integer term67183 = new Integer(-1767079160);
        Integer term67185 = new Integer(-201010601);
        Integer term67187 = new Integer(2060027076);
        Integer term67189 = new Integer(2084868811);
        ArrayList term67179 = new ArrayList();
        ((ArrayList) term67179).add(term67181);
        ((ArrayList) term67179).add(term67183);
        ((ArrayList) term67179).add(term67185);
        ((ArrayList) term67179).add(term67187);
        ((ArrayList) term67179).add(term67189);
        Integer term67195 = new Integer(314478878);
        Integer term67197 = new Integer(1425342686);
        Integer term67199 = new Integer(-1042470635);
        Integer term67201 = new Integer(-524352937);
        Integer term67203 = new Integer(1472218987);
        ArrayList term67193 = new ArrayList();
        ((ArrayList) term67193).add(term67195);
        ((ArrayList) term67193).add(term67197);
        ((ArrayList) term67193).add(term67199);
        ((ArrayList) term67193).add(term67201);
        ((ArrayList) term67193).add(term67203);
        term67112 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term67114 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term67116 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67137 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67147 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67112, term67112.getClass(), "id", -5297448090819479208L);
        setLongField(term67114, term67114.getClass(), "id", -2018377284090852639L);
        setLongField(term67116, term67116.getClass(), "id", -5415594352357248437L);
        setField(term67116, term67116.getClass(), "extId", term67118);
        setField(term67116, term67116.getClass(), "luid", "ltTwdndtbe");
        setIntField(term67133, term67133.getClass(), "year", 2012);
        setShortField(term67133, term67133.getClass(), "month", (short) 6);
        setShortField(term67133, term67133.getClass(), "day", (short) 24);
        setField(term67132, term67132.getClass(), "date", term67133);
        setByteField(term67137, term67137.getClass(), "hour", (byte) 23);
        setByteField(term67137, term67137.getClass(), "minute", (byte) 9);
        setByteField(term67137, term67137.getClass(), "second", (byte) 32);
        setIntField(term67137, term67137.getClass(), "nano", 933669930);
        setField(term67132, term67132.getClass(), "time", term67137);
        setField(term67116, term67116.getClass(), "registerTime", term67132);
        setIntField(term67143, term67143.getClass(), "year", 2013);
        setShortField(term67143, term67143.getClass(), "month", (short) 9);
        setShortField(term67143, term67143.getClass(), "day", (short) 29);
        setField(term67142, term67142.getClass(), "date", term67143);
        setByteField(term67147, term67147.getClass(), "hour", (byte) 18);
        setByteField(term67147, term67147.getClass(), "minute", (byte) 32);
        setByteField(term67147, term67147.getClass(), "second", (byte) 59);
        setIntField(term67147, term67147.getClass(), "nano", 213125607);
        setField(term67142, term67142.getClass(), "time", term67147);
        setField(term67116, term67116.getClass(), "accessTime", term67142);
        setField(term67114, term67114.getClass(), "card", term67116);
        setField(term67114, term67114.getClass(), "userName", "XaldiIeyMi");
        setIntField(term67114, term67114.getClass(), "isNetMember", -1106116513);
        setIntField(term67114, term67114.getClass(), "iconId", 1454640705);
        setIntField(term67114, term67114.getClass(), "plateId", -1492168193);
        setIntField(term67114, term67114.getClass(), "titleId", 144805805);
        setIntField(term67114, term67114.getClass(), "partnerId", 804939687);
        setIntField(term67114, term67114.getClass(), "frameId", 1638315840);
        setIntField(term67114, term67114.getClass(), "selectMapId", 2098018411);
        setIntField(term67114, term67114.getClass(), "totalAwake", 696364986);
        setIntField(term67114, term67114.getClass(), "gradeRating", 2133855407);
        setIntField(term67114, term67114.getClass(), "musicRating", -646910326);
        setIntField(term67114, term67114.getClass(), "playerRating", -740085612);
        setIntField(term67114, term67114.getClass(), "highestRating", -377361876);
        setIntField(term67114, term67114.getClass(), "gradeRank", -138587866);
        setIntField(term67114, term67114.getClass(), "classRank", 473269350);
        setIntField(term67114, term67114.getClass(), "courseRank", -1267755429);
        setField(term67114, term67114.getClass(), "charaSlot", term67179);
        setField(term67114, term67114.getClass(), "charaLockSlot", term67193);
        setLongField(term67114, term67114.getClass(), "contentBit", -9020854345282284171L);
        setIntField(term67114, term67114.getClass(), "playCount", 481428944);
        setField(term67114, term67114.getClass(), "eventWatchedDate", "lkujDCFpdm");
        setField(term67114, term67114.getClass(), "lastGameId", "sGfzmhpQEH");
        setField(term67114, term67114.getClass(), "lastRomVersion", "FqGkFGXAbg");
        setField(term67114, term67114.getClass(), "lastDataVersion", "SSWEZgFiFO");
        setField(term67114, term67114.getClass(), "lastLoginDate", "spphrCslQA");
        setField(term67114, term67114.getClass(), "lastPlayDate", "EPkEFVlZrY");
        setIntField(term67114, term67114.getClass(), "lastPlayCredit", 585379621);
        setIntField(term67114, term67114.getClass(), "lastPlayMode", 1343392329);
        setIntField(term67114, term67114.getClass(), "lastPlaceId", 9075231);
        setField(term67114, term67114.getClass(), "lastPlaceName", "jySnpYEVPv");
        setIntField(term67114, term67114.getClass(), "lastAllNetId", -1835849143);
        setIntField(term67114, term67114.getClass(), "lastRegionId", 156667044);
        setField(term67114, term67114.getClass(), "lastRegionName", "VdHqujFzSo");
        setField(term67114, term67114.getClass(), "lastClientId", "cZbOKEdKPs");
        setField(term67114, term67114.getClass(), "lastCountryCode", "nvXqvMSAjc");
        setIntField(term67114, term67114.getClass(), "lastSelectEMoney", -1224273100);
        setIntField(term67114, term67114.getClass(), "lastSelectTicket", -1428004018);
        setIntField(term67114, term67114.getClass(), "lastSelectCourse", -296242927);
        setIntField(term67114, term67114.getClass(), "lastCountCourse", -1009003985);
        setField(term67114, term67114.getClass(), "firstGameId", "agbhgbQisl");
        setField(term67114, term67114.getClass(), "firstRomVersion", "EZvlAVCXCm");
        setField(term67114, term67114.getClass(), "firstDataVersion", "axtbmWOSRY");
        setField(term67114, term67114.getClass(), "firstPlayDate", "TLlyjzxJUz");
        setField(term67114, term67114.getClass(), "compatibleCmVersion", "YclIWGPKZY");
        setField(term67114, term67114.getClass(), "dailyBonusDate", "gChBjLUhbg");
        setField(term67114, term67114.getClass(), "dailyCourseBonusDate", "enWkULOykY");
        setField(term67114, term67114.getClass(), "lastPairLoginDate", "BPdcafiAQX");
        setField(term67114, term67114.getClass(), "lastTrialPlayDate", "GvmOxwMrOk");
        setIntField(term67114, term67114.getClass(), "playVsCount", 281679450);
        setIntField(term67114, term67114.getClass(), "playSyncCount", -1773524930);
        setIntField(term67114, term67114.getClass(), "winCount", 2053145277);
        setIntField(term67114, term67114.getClass(), "helpCount", 472692952);
        setIntField(term67114, term67114.getClass(), "comboCount", 140138500);
        setLongField(term67114, term67114.getClass(), "totalDeluxscore", -31489852380702002L);
        setLongField(term67114, term67114.getClass(), "totalBasicDeluxscore", -1329952027265266740L);
        setLongField(term67114, term67114.getClass(), "totalAdvancedDeluxscore", 1567925232344622144L);
        setLongField(term67114, term67114.getClass(), "totalExpertDeluxscore", -5505212927676546906L);
        setLongField(term67114, term67114.getClass(), "totalMasterDeluxscore", -2309176226516464162L);
        setLongField(term67114, term67114.getClass(), "totalReMasterDeluxscore", -1164828048757086472L);
        setIntField(term67114, term67114.getClass(), "totalSync", -244584643);
        setIntField(term67114, term67114.getClass(), "totalBasicSync", 1557955716);
        setIntField(term67114, term67114.getClass(), "totalAdvancedSync", -1628863633);
        setIntField(term67114, term67114.getClass(), "totalExpertSync", -450265927);
        setIntField(term67114, term67114.getClass(), "totalMasterSync", 914533606);
        setIntField(term67114, term67114.getClass(), "totalReMasterSync", 1857214977);
        setLongField(term67114, term67114.getClass(), "totalAchievement", -2008405844948549125L);
        setLongField(term67114, term67114.getClass(), "totalBasicAchievement", 3744169870072117962L);
        setLongField(term67114, term67114.getClass(), "totalAdvancedAchievement", -3929129052663118960L);
        setLongField(term67114, term67114.getClass(), "totalExpertAchievement", -8701651184835718046L);
        setLongField(term67114, term67114.getClass(), "totalMasterAchievement", -4884840909566332937L);
        setLongField(term67114, term67114.getClass(), "totalReMasterAchievement", -169133604410652254L);
        setLongField(term67114, term67114.getClass(), "playerOldRating", -3017833790131447565L);
        setLongField(term67114, term67114.getClass(), "playerNewRating", -4035098953611869778L);
        setIntField(term67114, term67114.getClass(), "banState", 756946672);
        setLongField(term67114, term67114.getClass(), "dateTime", -4647988450998060301L);
        setField(term67112, term67112.getClass(), "user", term67114);
        setIntField(term67112, term67112.getClass(), "musicId", 1363323545);
        setIntField(term67112, term67112.getClass(), "level", -1090735178);
        setIntField(term67112, term67112.getClass(), "playCount", -651624649);
        setIntField(term67112, term67112.getClass(), "achievement", -888494532);
        setIntField(term67112, term67112.getClass(), "comboStatus", 284122377);
        setIntField(term67112, term67112.getClass(), "syncStatus", 1577003230);
        setIntField(term67112, term67112.getClass(), "deluxscoreMax", -2042495274);
        setIntField(term67112, term67112.getClass(), "scoreRank", 35579148);
        term67481 = new Integer(-77377900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term67481;
        callMethod(klass, "setScoreRank", argTypes, term67112, args);
    }

};


