package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setAvatarWear_1355304905355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288965;
     Object term289042;

    public UserData_setAvatarWear_1355304905355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288965 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term288965, term288965.getClass(), "id", 0L);
        setField(term288965, term288965.getClass(), "card", null);
        setField(term288965, term288965.getClass(), "userName", null);
        setIntField(term288965, term288965.getClass(), "level", 0);
        setIntField(term288965, term288965.getClass(), "reincarnationNum", 0);
        setField(term288965, term288965.getClass(), "exp", null);
        setLongField(term288965, term288965.getClass(), "point", 0L);
        setLongField(term288965, term288965.getClass(), "totalPoint", 0L);
        setIntField(term288965, term288965.getClass(), "playCount", 0);
        setIntField(term288965, term288965.getClass(), "multiPlayCount", 0);
        setIntField(term288965, term288965.getClass(), "playerRating", 0);
        setIntField(term288965, term288965.getClass(), "highestRating", 0);
        setIntField(term288965, term288965.getClass(), "nameplateId", 0);
        setIntField(term288965, term288965.getClass(), "frameId", 0);
        setIntField(term288965, term288965.getClass(), "characterId", 0);
        setIntField(term288965, term288965.getClass(), "trophyId", 0);
        setIntField(term288965, term288965.getClass(), "playedTutorialBit", 0);
        setIntField(term288965, term288965.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term288965, term288965.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term288965, term288965.getClass(), "totalMapNum", 0);
        setLongField(term288965, term288965.getClass(), "totalHiScore", 0L);
        setLongField(term288965, term288965.getClass(), "totalBasicHighScore", 0L);
        setLongField(term288965, term288965.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term288965, term288965.getClass(), "totalExpertHighScore", 0L);
        setLongField(term288965, term288965.getClass(), "totalMasterHighScore", 0L);
        setLongField(term288965, term288965.getClass(), "totalUltimaHighScore", 0L);
        setField(term288965, term288965.getClass(), "eventWatchedDate", null);
        setIntField(term288965, term288965.getClass(), "friendCount", 0);
        setField(term288965, term288965.getClass(), "firstGameId", null);
        setField(term288965, term288965.getClass(), "firstRomVersion", null);
        setField(term288965, term288965.getClass(), "firstDataVersion", null);
        setField(term288965, term288965.getClass(), "firstPlayDate", null);
        setField(term288965, term288965.getClass(), "lastGameId", null);
        setField(term288965, term288965.getClass(), "lastRomVersion", null);
        setField(term288965, term288965.getClass(), "lastDataVersion", null);
        setField(term288965, term288965.getClass(), "lastLoginDate", null);
        setField(term288965, term288965.getClass(), "lastPlayDate", null);
        setIntField(term288965, term288965.getClass(), "lastPlaceId", 0);
        setField(term288965, term288965.getClass(), "lastPlaceName", null);
        setField(term288965, term288965.getClass(), "lastRegionId", null);
        setField(term288965, term288965.getClass(), "lastRegionName", null);
        setField(term288965, term288965.getClass(), "lastAllNetId", null);
        setField(term288965, term288965.getClass(), "lastClientId", null);
        setField(term288965, term288965.getClass(), "lastCountryCode", null);
        setField(term288965, term288965.getClass(), "userNameEx", null);
        setField(term288965, term288965.getClass(), "compatibleCmVersion", null);
        setIntField(term288965, term288965.getClass(), "medal", 0);
        setIntField(term288965, term288965.getClass(), "mapIconId", 0);
        setIntField(term288965, term288965.getClass(), "voiceId", 0);
        setIntField(term288965, term288965.getClass(), "avatarWear", 0);
        setIntField(term288965, term288965.getClass(), "avatarHead", 0);
        setIntField(term288965, term288965.getClass(), "avatarFace", 0);
        setIntField(term288965, term288965.getClass(), "avatarSkin", 0);
        setIntField(term288965, term288965.getClass(), "avatarItem", 0);
        setIntField(term288965, term288965.getClass(), "avatarFront", 0);
        setIntField(term288965, term288965.getClass(), "avatarBack", 0);
        setIntField(term288965, term288965.getClass(), "classEmblemBase", 0);
        setIntField(term288965, term288965.getClass(), "classEmblemMedal", 0);
        setIntField(term288965, term288965.getClass(), "stockedGridCount", 0);
        setIntField(term288965, term288965.getClass(), "exMapLoopCount", 0);
        setIntField(term288965, term288965.getClass(), "netBattlePlayCount", 0);
        setIntField(term288965, term288965.getClass(), "netBattleWinCount", 0);
        setIntField(term288965, term288965.getClass(), "netBattleLoseCount", 0);
        setIntField(term288965, term288965.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term288965, term288965.getClass(), "charaIllustId", 0);
        setIntField(term288965, term288965.getClass(), "skillId", 0);
        setIntField(term288965, term288965.getClass(), "overPowerPoint", 0);
        setIntField(term288965, term288965.getClass(), "overPowerRate", 0);
        setIntField(term288965, term288965.getClass(), "overPowerLowerRank", 0);
        setIntField(term288965, term288965.getClass(), "avatarPoint", 0);
        setIntField(term288965, term288965.getClass(), "battleRankId", 0);
        setIntField(term288965, term288965.getClass(), "battleRankPoint", 0);
        setIntField(term288965, term288965.getClass(), "eliteRankPoint", 0);
        setIntField(term288965, term288965.getClass(), "netBattle1stCount", 0);
        setIntField(term288965, term288965.getClass(), "netBattle2ndCount", 0);
        setIntField(term288965, term288965.getClass(), "netBattle3rdCount", 0);
        setIntField(term288965, term288965.getClass(), "netBattle4thCount", 0);
        setIntField(term288965, term288965.getClass(), "netBattleCorrection", 0);
        setIntField(term288965, term288965.getClass(), "netBattleErrCnt", 0);
        setIntField(term288965, term288965.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term288965, term288965.getClass(), "battleRewardStatus", 0);
        setIntField(term288965, term288965.getClass(), "battleRewardIndex", 0);
        setIntField(term288965, term288965.getClass(), "battleRewardCount", 0);
        setIntField(term288965, term288965.getClass(), "ext1", 0);
        setIntField(term288965, term288965.getClass(), "ext2", 0);
        setIntField(term288965, term288965.getClass(), "ext3", 0);
        setIntField(term288965, term288965.getClass(), "ext4", 0);
        setIntField(term288965, term288965.getClass(), "ext5", 0);
        setIntField(term288965, term288965.getClass(), "ext6", 0);
        setIntField(term288965, term288965.getClass(), "ext7", 0);
        setIntField(term288965, term288965.getClass(), "ext8", 0);
        setIntField(term288965, term288965.getClass(), "ext9", 0);
        setIntField(term288965, term288965.getClass(), "ext10", 0);
        setField(term288965, term288965.getClass(), "extStr1", null);
        setField(term288965, term288965.getClass(), "extStr2", null);
        setLongField(term288965, term288965.getClass(), "extLong1", 0L);
        setLongField(term288965, term288965.getClass(), "extLong2", 0L);
        setField(term288965, term288965.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term288965, term288965.getClass(), "isNetBattleHost", false);
        setIntField(term288965, term288965.getClass(), "netBattleEndState", 0);
        term289042 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289042;
        callMethod(klass, "setAvatarWear", argTypes, term288965, args);
    }

};


