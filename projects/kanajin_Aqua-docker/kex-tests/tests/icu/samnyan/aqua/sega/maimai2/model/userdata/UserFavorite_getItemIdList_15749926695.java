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

public class UserFavorite_getItemIdList_15749926695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566163;

    public UserFavorite_getItemIdList_15749926695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term566169 = new Long(5255768275907389358L);
        Integer term566232 = new Integer(272546912);
        Integer term566234 = new Integer(-1534845297);
        Integer term566236 = new Integer(1159214599);
        Integer term566238 = new Integer(2063913776);
        Integer term566240 = new Integer(-167719421);
        Integer term566242 = new Integer(1185474565);
        Integer term566244 = new Integer(-1081016436);
        ArrayList term566230 = new ArrayList();
        ((ArrayList) term566230).add(term566232);
        ((ArrayList) term566230).add(term566234);
        ((ArrayList) term566230).add(term566236);
        ((ArrayList) term566230).add(term566238);
        ((ArrayList) term566230).add(term566240);
        ((ArrayList) term566230).add(term566242);
        ((ArrayList) term566230).add(term566244);
        Integer term566250 = new Integer(1465385986);
        Integer term566252 = new Integer(1976158913);
        Integer term566254 = new Integer(696093985);
        Integer term566256 = new Integer(488572556);
        Integer term566258 = new Integer(2103579931);
        Integer term566260 = new Integer(-363708885);
        Integer term566262 = new Integer(-1777069422);
        ArrayList term566248 = new ArrayList();
        ((ArrayList) term566248).add(term566250);
        ((ArrayList) term566248).add(term566252);
        ((ArrayList) term566248).add(term566254);
        ((ArrayList) term566248).add(term566256);
        ((ArrayList) term566248).add(term566258);
        ((ArrayList) term566248).add(term566260);
        ((ArrayList) term566248).add(term566262);
        Integer term566536 = new Integer(1328193739);
        Integer term566538 = new Integer(1769168524);
        Integer term566540 = new Integer(527335694);
        Integer term566542 = new Integer(1217049721);
        ArrayList term566534 = new ArrayList();
        ((ArrayList) term566534).add(term566536);
        ((ArrayList) term566534).add(term566538);
        ((ArrayList) term566534).add(term566540);
        ((ArrayList) term566534).add(term566542);
        term566163 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite"));
        Object term566165 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term566167 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term566183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term566184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term566188 = newInstance(Class.forName("java.time.LocalTime"));
        Object term566193 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term566194 = newInstance(Class.forName("java.time.LocalDate"));
        Object term566198 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term566163, term566163.getClass(), "id", 7055478616555916939L);
        setLongField(term566165, term566165.getClass(), "id", 2324663213089403250L);
        setLongField(term566167, term566167.getClass(), "id", -3216804456172866727L);
        setField(term566167, term566167.getClass(), "extId", term566169);
        setField(term566167, term566167.getClass(), "luid", "nNxaFYbFhk");
        setIntField(term566184, term566184.getClass(), "year", 2014);
        setShortField(term566184, term566184.getClass(), "month", (short) 8);
        setShortField(term566184, term566184.getClass(), "day", (short) 20);
        setField(term566183, term566183.getClass(), "date", term566184);
        setByteField(term566188, term566188.getClass(), "hour", (byte) 7);
        setByteField(term566188, term566188.getClass(), "minute", (byte) 38);
        setByteField(term566188, term566188.getClass(), "second", (byte) 47);
        setIntField(term566188, term566188.getClass(), "nano", 532211394);
        setField(term566183, term566183.getClass(), "time", term566188);
        setField(term566167, term566167.getClass(), "registerTime", term566183);
        setIntField(term566194, term566194.getClass(), "year", 2025);
        setShortField(term566194, term566194.getClass(), "month", (short) 2);
        setShortField(term566194, term566194.getClass(), "day", (short) 13);
        setField(term566193, term566193.getClass(), "date", term566194);
        setByteField(term566198, term566198.getClass(), "hour", (byte) 2);
        setByteField(term566198, term566198.getClass(), "minute", (byte) 25);
        setByteField(term566198, term566198.getClass(), "second", (byte) 41);
        setIntField(term566198, term566198.getClass(), "nano", 234411599);
        setField(term566193, term566193.getClass(), "time", term566198);
        setField(term566167, term566167.getClass(), "accessTime", term566193);
        setField(term566165, term566165.getClass(), "card", term566167);
        setField(term566165, term566165.getClass(), "userName", "GzYvECDdOa");
        setIntField(term566165, term566165.getClass(), "isNetMember", -1119721613);
        setIntField(term566165, term566165.getClass(), "iconId", -99220474);
        setIntField(term566165, term566165.getClass(), "plateId", 1854612673);
        setIntField(term566165, term566165.getClass(), "titleId", -1635976520);
        setIntField(term566165, term566165.getClass(), "partnerId", 792707238);
        setIntField(term566165, term566165.getClass(), "frameId", 356920875);
        setIntField(term566165, term566165.getClass(), "selectMapId", 1720517843);
        setIntField(term566165, term566165.getClass(), "totalAwake", -1837626730);
        setIntField(term566165, term566165.getClass(), "gradeRating", 515802614);
        setIntField(term566165, term566165.getClass(), "musicRating", -1331410055);
        setIntField(term566165, term566165.getClass(), "playerRating", 568881061);
        setIntField(term566165, term566165.getClass(), "highestRating", 538221161);
        setIntField(term566165, term566165.getClass(), "gradeRank", 1407157742);
        setIntField(term566165, term566165.getClass(), "classRank", -881363466);
        setIntField(term566165, term566165.getClass(), "courseRank", -323150693);
        setField(term566165, term566165.getClass(), "charaSlot", term566230);
        setField(term566165, term566165.getClass(), "charaLockSlot", term566248);
        setLongField(term566165, term566165.getClass(), "contentBit", -74924395422679030L);
        setIntField(term566165, term566165.getClass(), "playCount", 1121722824);
        setField(term566165, term566165.getClass(), "eventWatchedDate", "wgbgSBZLwP");
        setField(term566165, term566165.getClass(), "lastGameId", "RbJAjtOyEC");
        setField(term566165, term566165.getClass(), "lastRomVersion", "tdVhrcRQQm");
        setField(term566165, term566165.getClass(), "lastDataVersion", "ejKPlzUUki");
        setField(term566165, term566165.getClass(), "lastLoginDate", "SiKsjwmkPz");
        setField(term566165, term566165.getClass(), "lastPlayDate", "IxDbGrRCSC");
        setIntField(term566165, term566165.getClass(), "lastPlayCredit", 549741733);
        setIntField(term566165, term566165.getClass(), "lastPlayMode", 676666412);
        setIntField(term566165, term566165.getClass(), "lastPlaceId", -1779324293);
        setField(term566165, term566165.getClass(), "lastPlaceName", "xVKwejMUSh");
        setIntField(term566165, term566165.getClass(), "lastAllNetId", 452846239);
        setIntField(term566165, term566165.getClass(), "lastRegionId", 436569083);
        setField(term566165, term566165.getClass(), "lastRegionName", "YHuQNQayjx");
        setField(term566165, term566165.getClass(), "lastClientId", "ywwACyUAUR");
        setField(term566165, term566165.getClass(), "lastCountryCode", "UozREqziBi");
        setIntField(term566165, term566165.getClass(), "lastSelectEMoney", -592314850);
        setIntField(term566165, term566165.getClass(), "lastSelectTicket", -1675457710);
        setIntField(term566165, term566165.getClass(), "lastSelectCourse", -450350780);
        setIntField(term566165, term566165.getClass(), "lastCountCourse", -1620595678);
        setField(term566165, term566165.getClass(), "firstGameId", "AFjqMhiaul");
        setField(term566165, term566165.getClass(), "firstRomVersion", "ItdqLGXwVd");
        setField(term566165, term566165.getClass(), "firstDataVersion", "rxiCFTVFZP");
        setField(term566165, term566165.getClass(), "firstPlayDate", "nBBUJLtJqC");
        setField(term566165, term566165.getClass(), "compatibleCmVersion", "yvSETHdPRA");
        setField(term566165, term566165.getClass(), "dailyBonusDate", "XXdWUxBeFl");
        setField(term566165, term566165.getClass(), "dailyCourseBonusDate", "YGvKOpsRjI");
        setField(term566165, term566165.getClass(), "lastPairLoginDate", "MknkZVAwDo");
        setField(term566165, term566165.getClass(), "lastTrialPlayDate", "aczvRILssC");
        setIntField(term566165, term566165.getClass(), "playVsCount", -1924037254);
        setIntField(term566165, term566165.getClass(), "playSyncCount", 1513704088);
        setIntField(term566165, term566165.getClass(), "winCount", -1054496312);
        setIntField(term566165, term566165.getClass(), "helpCount", -1406846880);
        setIntField(term566165, term566165.getClass(), "comboCount", 408284426);
        setLongField(term566165, term566165.getClass(), "totalDeluxscore", -8388318547436102589L);
        setLongField(term566165, term566165.getClass(), "totalBasicDeluxscore", 162516580520846805L);
        setLongField(term566165, term566165.getClass(), "totalAdvancedDeluxscore", -757288866766725536L);
        setLongField(term566165, term566165.getClass(), "totalExpertDeluxscore", -8992031273234993301L);
        setLongField(term566165, term566165.getClass(), "totalMasterDeluxscore", -5725230786135516495L);
        setLongField(term566165, term566165.getClass(), "totalReMasterDeluxscore", -5066118757238552628L);
        setIntField(term566165, term566165.getClass(), "totalSync", -357592686);
        setIntField(term566165, term566165.getClass(), "totalBasicSync", 1871177359);
        setIntField(term566165, term566165.getClass(), "totalAdvancedSync", -1592341486);
        setIntField(term566165, term566165.getClass(), "totalExpertSync", -1830360208);
        setIntField(term566165, term566165.getClass(), "totalMasterSync", 1523813879);
        setIntField(term566165, term566165.getClass(), "totalReMasterSync", 1898875939);
        setLongField(term566165, term566165.getClass(), "totalAchievement", 771432223061928108L);
        setLongField(term566165, term566165.getClass(), "totalBasicAchievement", 4183917335994404993L);
        setLongField(term566165, term566165.getClass(), "totalAdvancedAchievement", -3422004229655337736L);
        setLongField(term566165, term566165.getClass(), "totalExpertAchievement", 7326284757231474688L);
        setLongField(term566165, term566165.getClass(), "totalMasterAchievement", -7994306152738297740L);
        setLongField(term566165, term566165.getClass(), "totalReMasterAchievement", 3710436543370400340L);
        setLongField(term566165, term566165.getClass(), "playerOldRating", -9185951429523461251L);
        setLongField(term566165, term566165.getClass(), "playerNewRating", -8145570656837388291L);
        setIntField(term566165, term566165.getClass(), "banState", -985410573);
        setLongField(term566165, term566165.getClass(), "dateTime", -3013887399069755024L);
        setField(term566163, term566163.getClass(), "user", term566165);
        setLongField(term566163, term566163.getClass(), "favUserId", -2227180698139201772L);
        setIntField(term566163, term566163.getClass(), "itemKind", -41167598);
        setField(term566163, term566163.getClass(), "itemIdList", term566534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemIdList", argTypes, term566163, args);
    }

};


