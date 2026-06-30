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

public class UserDetail_getTotalBasicAchievement_72891240768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4268058;

    public UserDetail_getTotalBasicAchievement_72891240768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4268062 = new Long(-7951746157411525124L);
        Integer term4268125 = new Integer(-63641196);
        Integer term4268127 = new Integer(1871287078);
        Integer term4268129 = new Integer(792196604);
        Integer term4268131 = new Integer(-1306447464);
        Integer term4268133 = new Integer(-1027761764);
        Integer term4268135 = new Integer(766326251);
        Integer term4268137 = new Integer(-557939372);
        Integer term4268139 = new Integer(924802684);
        ArrayList term4268123 = new ArrayList();
        ((ArrayList) term4268123).add(term4268125);
        ((ArrayList) term4268123).add(term4268127);
        ((ArrayList) term4268123).add(term4268129);
        ((ArrayList) term4268123).add(term4268131);
        ((ArrayList) term4268123).add(term4268133);
        ((ArrayList) term4268123).add(term4268135);
        ((ArrayList) term4268123).add(term4268137);
        ((ArrayList) term4268123).add(term4268139);
        Integer term4268145 = new Integer(647650611);
        Integer term4268147 = new Integer(1830557897);
        Integer term4268149 = new Integer(-1998060372);
        Integer term4268151 = new Integer(567825669);
        Integer term4268153 = new Integer(-119885836);
        Integer term4268155 = new Integer(698701205);
        Integer term4268157 = new Integer(733986936);
        Integer term4268159 = new Integer(-1752207831);
        Integer term4268161 = new Integer(-1175000933);
        ArrayList term4268143 = new ArrayList();
        ((ArrayList) term4268143).add(term4268145);
        ((ArrayList) term4268143).add(term4268147);
        ((ArrayList) term4268143).add(term4268149);
        ((ArrayList) term4268143).add(term4268151);
        ((ArrayList) term4268143).add(term4268153);
        ((ArrayList) term4268143).add(term4268155);
        ((ArrayList) term4268143).add(term4268157);
        ((ArrayList) term4268143).add(term4268159);
        ((ArrayList) term4268143).add(term4268161);
        term4268058 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4268060 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4268076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4268077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4268081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4268086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4268087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4268091 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4268058, term4268058.getClass(), "id", 6654828866421956239L);
        setLongField(term4268060, term4268060.getClass(), "id", -8080897287888617520L);
        setField(term4268060, term4268060.getClass(), "extId", term4268062);
        setField(term4268060, term4268060.getClass(), "luid", "rxarBEysxj");
        setIntField(term4268077, term4268077.getClass(), "year", 2026);
        setShortField(term4268077, term4268077.getClass(), "month", (short) 2);
        setShortField(term4268077, term4268077.getClass(), "day", (short) 11);
        setField(term4268076, term4268076.getClass(), "date", term4268077);
        setByteField(term4268081, term4268081.getClass(), "hour", (byte) 23);
        setByteField(term4268081, term4268081.getClass(), "minute", (byte) 36);
        setByteField(term4268081, term4268081.getClass(), "second", (byte) 31);
        setIntField(term4268081, term4268081.getClass(), "nano", 829771762);
        setField(term4268076, term4268076.getClass(), "time", term4268081);
        setField(term4268060, term4268060.getClass(), "registerTime", term4268076);
        setIntField(term4268087, term4268087.getClass(), "year", 2012);
        setShortField(term4268087, term4268087.getClass(), "month", (short) 1);
        setShortField(term4268087, term4268087.getClass(), "day", (short) 27);
        setField(term4268086, term4268086.getClass(), "date", term4268087);
        setByteField(term4268091, term4268091.getClass(), "hour", (byte) 20);
        setByteField(term4268091, term4268091.getClass(), "minute", (byte) 49);
        setByteField(term4268091, term4268091.getClass(), "second", (byte) 55);
        setIntField(term4268091, term4268091.getClass(), "nano", 35699244);
        setField(term4268086, term4268086.getClass(), "time", term4268091);
        setField(term4268060, term4268060.getClass(), "accessTime", term4268086);
        setField(term4268058, term4268058.getClass(), "card", term4268060);
        setField(term4268058, term4268058.getClass(), "userName", "sSJPiHcdPu");
        setIntField(term4268058, term4268058.getClass(), "isNetMember", -551761312);
        setIntField(term4268058, term4268058.getClass(), "iconId", 1532844924);
        setIntField(term4268058, term4268058.getClass(), "plateId", 1293072514);
        setIntField(term4268058, term4268058.getClass(), "titleId", -838804751);
        setIntField(term4268058, term4268058.getClass(), "partnerId", 1675705242);
        setIntField(term4268058, term4268058.getClass(), "frameId", -1080343407);
        setIntField(term4268058, term4268058.getClass(), "selectMapId", -1669233890);
        setIntField(term4268058, term4268058.getClass(), "totalAwake", 978780313);
        setIntField(term4268058, term4268058.getClass(), "gradeRating", -927401309);
        setIntField(term4268058, term4268058.getClass(), "musicRating", 855168147);
        setIntField(term4268058, term4268058.getClass(), "playerRating", -488073326);
        setIntField(term4268058, term4268058.getClass(), "highestRating", 1873435249);
        setIntField(term4268058, term4268058.getClass(), "gradeRank", 1293453317);
        setIntField(term4268058, term4268058.getClass(), "classRank", 569892741);
        setIntField(term4268058, term4268058.getClass(), "courseRank", -235689792);
        setField(term4268058, term4268058.getClass(), "charaSlot", term4268123);
        setField(term4268058, term4268058.getClass(), "charaLockSlot", term4268143);
        setLongField(term4268058, term4268058.getClass(), "contentBit", -3665614940257803315L);
        setIntField(term4268058, term4268058.getClass(), "playCount", 1506967326);
        setField(term4268058, term4268058.getClass(), "eventWatchedDate", "IHmhIEGREM");
        setField(term4268058, term4268058.getClass(), "lastGameId", "fsBngJIjzP");
        setField(term4268058, term4268058.getClass(), "lastRomVersion", "vetBlvzIMi");
        setField(term4268058, term4268058.getClass(), "lastDataVersion", "aodfKhDjYc");
        setField(term4268058, term4268058.getClass(), "lastLoginDate", "cBphZsnUsi");
        setField(term4268058, term4268058.getClass(), "lastPlayDate", "SVVuUaeQXM");
        setIntField(term4268058, term4268058.getClass(), "lastPlayCredit", -1404920212);
        setIntField(term4268058, term4268058.getClass(), "lastPlayMode", 126035405);
        setIntField(term4268058, term4268058.getClass(), "lastPlaceId", -2122224012);
        setField(term4268058, term4268058.getClass(), "lastPlaceName", "oxwJQeOEDx");
        setIntField(term4268058, term4268058.getClass(), "lastAllNetId", -329005656);
        setIntField(term4268058, term4268058.getClass(), "lastRegionId", 783289923);
        setField(term4268058, term4268058.getClass(), "lastRegionName", "wQnaUQKlFA");
        setField(term4268058, term4268058.getClass(), "lastClientId", "ECYAprPmMG");
        setField(term4268058, term4268058.getClass(), "lastCountryCode", "zWodMuSPfE");
        setIntField(term4268058, term4268058.getClass(), "lastSelectEMoney", -659803901);
        setIntField(term4268058, term4268058.getClass(), "lastSelectTicket", 256975781);
        setIntField(term4268058, term4268058.getClass(), "lastSelectCourse", -1649467280);
        setIntField(term4268058, term4268058.getClass(), "lastCountCourse", 1487351710);
        setField(term4268058, term4268058.getClass(), "firstGameId", "wVwExiZGxC");
        setField(term4268058, term4268058.getClass(), "firstRomVersion", "wyRFFUkkAr");
        setField(term4268058, term4268058.getClass(), "firstDataVersion", "ctSWsnmdOW");
        setField(term4268058, term4268058.getClass(), "firstPlayDate", "FSGseLLOUJ");
        setField(term4268058, term4268058.getClass(), "compatibleCmVersion", "nGCYFxMSyO");
        setField(term4268058, term4268058.getClass(), "dailyBonusDate", "GShOWJQnuT");
        setField(term4268058, term4268058.getClass(), "dailyCourseBonusDate", "JDLJBfczdZ");
        setField(term4268058, term4268058.getClass(), "lastPairLoginDate", "xZKbtjnpCW");
        setField(term4268058, term4268058.getClass(), "lastTrialPlayDate", "mlRncfQHUF");
        setIntField(term4268058, term4268058.getClass(), "playVsCount", 564767244);
        setIntField(term4268058, term4268058.getClass(), "playSyncCount", 1796416762);
        setIntField(term4268058, term4268058.getClass(), "winCount", -1846529183);
        setIntField(term4268058, term4268058.getClass(), "helpCount", 1153306202);
        setIntField(term4268058, term4268058.getClass(), "comboCount", 1813806183);
        setLongField(term4268058, term4268058.getClass(), "totalDeluxscore", -744979112949237674L);
        setLongField(term4268058, term4268058.getClass(), "totalBasicDeluxscore", -455996300636842109L);
        setLongField(term4268058, term4268058.getClass(), "totalAdvancedDeluxscore", 5115328842548463639L);
        setLongField(term4268058, term4268058.getClass(), "totalExpertDeluxscore", 2274056641647817800L);
        setLongField(term4268058, term4268058.getClass(), "totalMasterDeluxscore", 4551974340522140922L);
        setLongField(term4268058, term4268058.getClass(), "totalReMasterDeluxscore", -828468751579881491L);
        setIntField(term4268058, term4268058.getClass(), "totalSync", -922324081);
        setIntField(term4268058, term4268058.getClass(), "totalBasicSync", -1869997723);
        setIntField(term4268058, term4268058.getClass(), "totalAdvancedSync", 1192277122);
        setIntField(term4268058, term4268058.getClass(), "totalExpertSync", -801940794);
        setIntField(term4268058, term4268058.getClass(), "totalMasterSync", 128262136);
        setIntField(term4268058, term4268058.getClass(), "totalReMasterSync", -1236890341);
        setLongField(term4268058, term4268058.getClass(), "totalAchievement", -7788576641251085959L);
        setLongField(term4268058, term4268058.getClass(), "totalBasicAchievement", -3604927337932898625L);
        setLongField(term4268058, term4268058.getClass(), "totalAdvancedAchievement", -6013817514126750845L);
        setLongField(term4268058, term4268058.getClass(), "totalExpertAchievement", 6790273019673491209L);
        setLongField(term4268058, term4268058.getClass(), "totalMasterAchievement", 5976694283857356195L);
        setLongField(term4268058, term4268058.getClass(), "totalReMasterAchievement", -3746356988549060388L);
        setLongField(term4268058, term4268058.getClass(), "playerOldRating", -7505210399954350496L);
        setLongField(term4268058, term4268058.getClass(), "playerNewRating", 4398257724552207889L);
        setIntField(term4268058, term4268058.getClass(), "banState", 782710516);
        setLongField(term4268058, term4268058.getClass(), "dateTime", -8552844560027432473L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicAchievement", argTypes, term4268058, args);
    }

};


