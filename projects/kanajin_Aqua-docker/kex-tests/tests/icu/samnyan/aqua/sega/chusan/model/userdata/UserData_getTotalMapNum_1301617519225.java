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

public class UserData_getTotalMapNum_1301617519225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278899;

    public UserData_getTotalMapNum_1301617519225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278899 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term278899, term278899.getClass(), "id", 0L);
        setField(term278899, term278899.getClass(), "card", null);
        setField(term278899, term278899.getClass(), "userName", null);
        setIntField(term278899, term278899.getClass(), "level", 0);
        setIntField(term278899, term278899.getClass(), "reincarnationNum", 0);
        setField(term278899, term278899.getClass(), "exp", null);
        setLongField(term278899, term278899.getClass(), "point", 0L);
        setLongField(term278899, term278899.getClass(), "totalPoint", 0L);
        setIntField(term278899, term278899.getClass(), "playCount", 0);
        setIntField(term278899, term278899.getClass(), "multiPlayCount", 0);
        setIntField(term278899, term278899.getClass(), "playerRating", 0);
        setIntField(term278899, term278899.getClass(), "highestRating", 0);
        setIntField(term278899, term278899.getClass(), "nameplateId", 0);
        setIntField(term278899, term278899.getClass(), "frameId", 0);
        setIntField(term278899, term278899.getClass(), "characterId", 0);
        setIntField(term278899, term278899.getClass(), "trophyId", 0);
        setIntField(term278899, term278899.getClass(), "playedTutorialBit", 0);
        setIntField(term278899, term278899.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term278899, term278899.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term278899, term278899.getClass(), "totalMapNum", 0);
        setLongField(term278899, term278899.getClass(), "totalHiScore", 0L);
        setLongField(term278899, term278899.getClass(), "totalBasicHighScore", 0L);
        setLongField(term278899, term278899.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term278899, term278899.getClass(), "totalExpertHighScore", 0L);
        setLongField(term278899, term278899.getClass(), "totalMasterHighScore", 0L);
        setLongField(term278899, term278899.getClass(), "totalUltimaHighScore", 0L);
        setField(term278899, term278899.getClass(), "eventWatchedDate", null);
        setIntField(term278899, term278899.getClass(), "friendCount", 0);
        setField(term278899, term278899.getClass(), "firstGameId", null);
        setField(term278899, term278899.getClass(), "firstRomVersion", null);
        setField(term278899, term278899.getClass(), "firstDataVersion", null);
        setField(term278899, term278899.getClass(), "firstPlayDate", null);
        setField(term278899, term278899.getClass(), "lastGameId", null);
        setField(term278899, term278899.getClass(), "lastRomVersion", null);
        setField(term278899, term278899.getClass(), "lastDataVersion", null);
        setField(term278899, term278899.getClass(), "lastLoginDate", null);
        setField(term278899, term278899.getClass(), "lastPlayDate", null);
        setIntField(term278899, term278899.getClass(), "lastPlaceId", 0);
        setField(term278899, term278899.getClass(), "lastPlaceName", null);
        setField(term278899, term278899.getClass(), "lastRegionId", null);
        setField(term278899, term278899.getClass(), "lastRegionName", null);
        setField(term278899, term278899.getClass(), "lastAllNetId", null);
        setField(term278899, term278899.getClass(), "lastClientId", null);
        setField(term278899, term278899.getClass(), "lastCountryCode", null);
        setField(term278899, term278899.getClass(), "userNameEx", null);
        setField(term278899, term278899.getClass(), "compatibleCmVersion", null);
        setIntField(term278899, term278899.getClass(), "medal", 0);
        setIntField(term278899, term278899.getClass(), "mapIconId", 0);
        setIntField(term278899, term278899.getClass(), "voiceId", 0);
        setIntField(term278899, term278899.getClass(), "avatarWear", 0);
        setIntField(term278899, term278899.getClass(), "avatarHead", 0);
        setIntField(term278899, term278899.getClass(), "avatarFace", 0);
        setIntField(term278899, term278899.getClass(), "avatarSkin", 0);
        setIntField(term278899, term278899.getClass(), "avatarItem", 0);
        setIntField(term278899, term278899.getClass(), "avatarFront", 0);
        setIntField(term278899, term278899.getClass(), "avatarBack", 0);
        setIntField(term278899, term278899.getClass(), "classEmblemBase", 0);
        setIntField(term278899, term278899.getClass(), "classEmblemMedal", 0);
        setIntField(term278899, term278899.getClass(), "stockedGridCount", 0);
        setIntField(term278899, term278899.getClass(), "exMapLoopCount", 0);
        setIntField(term278899, term278899.getClass(), "netBattlePlayCount", 0);
        setIntField(term278899, term278899.getClass(), "netBattleWinCount", 0);
        setIntField(term278899, term278899.getClass(), "netBattleLoseCount", 0);
        setIntField(term278899, term278899.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term278899, term278899.getClass(), "charaIllustId", 0);
        setIntField(term278899, term278899.getClass(), "skillId", 0);
        setIntField(term278899, term278899.getClass(), "overPowerPoint", 0);
        setIntField(term278899, term278899.getClass(), "overPowerRate", 0);
        setIntField(term278899, term278899.getClass(), "overPowerLowerRank", 0);
        setIntField(term278899, term278899.getClass(), "avatarPoint", 0);
        setIntField(term278899, term278899.getClass(), "battleRankId", 0);
        setIntField(term278899, term278899.getClass(), "battleRankPoint", 0);
        setIntField(term278899, term278899.getClass(), "eliteRankPoint", 0);
        setIntField(term278899, term278899.getClass(), "netBattle1stCount", 0);
        setIntField(term278899, term278899.getClass(), "netBattle2ndCount", 0);
        setIntField(term278899, term278899.getClass(), "netBattle3rdCount", 0);
        setIntField(term278899, term278899.getClass(), "netBattle4thCount", 0);
        setIntField(term278899, term278899.getClass(), "netBattleCorrection", 0);
        setIntField(term278899, term278899.getClass(), "netBattleErrCnt", 0);
        setIntField(term278899, term278899.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term278899, term278899.getClass(), "battleRewardStatus", 0);
        setIntField(term278899, term278899.getClass(), "battleRewardIndex", 0);
        setIntField(term278899, term278899.getClass(), "battleRewardCount", 0);
        setIntField(term278899, term278899.getClass(), "ext1", 0);
        setIntField(term278899, term278899.getClass(), "ext2", 0);
        setIntField(term278899, term278899.getClass(), "ext3", 0);
        setIntField(term278899, term278899.getClass(), "ext4", 0);
        setIntField(term278899, term278899.getClass(), "ext5", 0);
        setIntField(term278899, term278899.getClass(), "ext6", 0);
        setIntField(term278899, term278899.getClass(), "ext7", 0);
        setIntField(term278899, term278899.getClass(), "ext8", 0);
        setIntField(term278899, term278899.getClass(), "ext9", 0);
        setIntField(term278899, term278899.getClass(), "ext10", 0);
        setField(term278899, term278899.getClass(), "extStr1", null);
        setField(term278899, term278899.getClass(), "extStr2", null);
        setLongField(term278899, term278899.getClass(), "extLong1", 0L);
        setLongField(term278899, term278899.getClass(), "extLong2", 0L);
        setField(term278899, term278899.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term278899, term278899.getClass(), "isNetBattleHost", false);
        setIntField(term278899, term278899.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMapNum", argTypes, term278899, args);
    }

};


