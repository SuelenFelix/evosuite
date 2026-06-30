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

public class UserData_getPlayerRating_398868525216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278206;

    public UserData_getPlayerRating_398868525216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278206 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term278206, term278206.getClass(), "id", 0L);
        setField(term278206, term278206.getClass(), "card", null);
        setField(term278206, term278206.getClass(), "userName", null);
        setIntField(term278206, term278206.getClass(), "level", 0);
        setIntField(term278206, term278206.getClass(), "reincarnationNum", 0);
        setField(term278206, term278206.getClass(), "exp", null);
        setLongField(term278206, term278206.getClass(), "point", 0L);
        setLongField(term278206, term278206.getClass(), "totalPoint", 0L);
        setIntField(term278206, term278206.getClass(), "playCount", 0);
        setIntField(term278206, term278206.getClass(), "multiPlayCount", 0);
        setIntField(term278206, term278206.getClass(), "playerRating", 0);
        setIntField(term278206, term278206.getClass(), "highestRating", 0);
        setIntField(term278206, term278206.getClass(), "nameplateId", 0);
        setIntField(term278206, term278206.getClass(), "frameId", 0);
        setIntField(term278206, term278206.getClass(), "characterId", 0);
        setIntField(term278206, term278206.getClass(), "trophyId", 0);
        setIntField(term278206, term278206.getClass(), "playedTutorialBit", 0);
        setIntField(term278206, term278206.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term278206, term278206.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term278206, term278206.getClass(), "totalMapNum", 0);
        setLongField(term278206, term278206.getClass(), "totalHiScore", 0L);
        setLongField(term278206, term278206.getClass(), "totalBasicHighScore", 0L);
        setLongField(term278206, term278206.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term278206, term278206.getClass(), "totalExpertHighScore", 0L);
        setLongField(term278206, term278206.getClass(), "totalMasterHighScore", 0L);
        setLongField(term278206, term278206.getClass(), "totalUltimaHighScore", 0L);
        setField(term278206, term278206.getClass(), "eventWatchedDate", null);
        setIntField(term278206, term278206.getClass(), "friendCount", 0);
        setField(term278206, term278206.getClass(), "firstGameId", null);
        setField(term278206, term278206.getClass(), "firstRomVersion", null);
        setField(term278206, term278206.getClass(), "firstDataVersion", null);
        setField(term278206, term278206.getClass(), "firstPlayDate", null);
        setField(term278206, term278206.getClass(), "lastGameId", null);
        setField(term278206, term278206.getClass(), "lastRomVersion", null);
        setField(term278206, term278206.getClass(), "lastDataVersion", null);
        setField(term278206, term278206.getClass(), "lastLoginDate", null);
        setField(term278206, term278206.getClass(), "lastPlayDate", null);
        setIntField(term278206, term278206.getClass(), "lastPlaceId", 0);
        setField(term278206, term278206.getClass(), "lastPlaceName", null);
        setField(term278206, term278206.getClass(), "lastRegionId", null);
        setField(term278206, term278206.getClass(), "lastRegionName", null);
        setField(term278206, term278206.getClass(), "lastAllNetId", null);
        setField(term278206, term278206.getClass(), "lastClientId", null);
        setField(term278206, term278206.getClass(), "lastCountryCode", null);
        setField(term278206, term278206.getClass(), "userNameEx", null);
        setField(term278206, term278206.getClass(), "compatibleCmVersion", null);
        setIntField(term278206, term278206.getClass(), "medal", 0);
        setIntField(term278206, term278206.getClass(), "mapIconId", 0);
        setIntField(term278206, term278206.getClass(), "voiceId", 0);
        setIntField(term278206, term278206.getClass(), "avatarWear", 0);
        setIntField(term278206, term278206.getClass(), "avatarHead", 0);
        setIntField(term278206, term278206.getClass(), "avatarFace", 0);
        setIntField(term278206, term278206.getClass(), "avatarSkin", 0);
        setIntField(term278206, term278206.getClass(), "avatarItem", 0);
        setIntField(term278206, term278206.getClass(), "avatarFront", 0);
        setIntField(term278206, term278206.getClass(), "avatarBack", 0);
        setIntField(term278206, term278206.getClass(), "classEmblemBase", 0);
        setIntField(term278206, term278206.getClass(), "classEmblemMedal", 0);
        setIntField(term278206, term278206.getClass(), "stockedGridCount", 0);
        setIntField(term278206, term278206.getClass(), "exMapLoopCount", 0);
        setIntField(term278206, term278206.getClass(), "netBattlePlayCount", 0);
        setIntField(term278206, term278206.getClass(), "netBattleWinCount", 0);
        setIntField(term278206, term278206.getClass(), "netBattleLoseCount", 0);
        setIntField(term278206, term278206.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term278206, term278206.getClass(), "charaIllustId", 0);
        setIntField(term278206, term278206.getClass(), "skillId", 0);
        setIntField(term278206, term278206.getClass(), "overPowerPoint", 0);
        setIntField(term278206, term278206.getClass(), "overPowerRate", 0);
        setIntField(term278206, term278206.getClass(), "overPowerLowerRank", 0);
        setIntField(term278206, term278206.getClass(), "avatarPoint", 0);
        setIntField(term278206, term278206.getClass(), "battleRankId", 0);
        setIntField(term278206, term278206.getClass(), "battleRankPoint", 0);
        setIntField(term278206, term278206.getClass(), "eliteRankPoint", 0);
        setIntField(term278206, term278206.getClass(), "netBattle1stCount", 0);
        setIntField(term278206, term278206.getClass(), "netBattle2ndCount", 0);
        setIntField(term278206, term278206.getClass(), "netBattle3rdCount", 0);
        setIntField(term278206, term278206.getClass(), "netBattle4thCount", 0);
        setIntField(term278206, term278206.getClass(), "netBattleCorrection", 0);
        setIntField(term278206, term278206.getClass(), "netBattleErrCnt", 0);
        setIntField(term278206, term278206.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term278206, term278206.getClass(), "battleRewardStatus", 0);
        setIntField(term278206, term278206.getClass(), "battleRewardIndex", 0);
        setIntField(term278206, term278206.getClass(), "battleRewardCount", 0);
        setIntField(term278206, term278206.getClass(), "ext1", 0);
        setIntField(term278206, term278206.getClass(), "ext2", 0);
        setIntField(term278206, term278206.getClass(), "ext3", 0);
        setIntField(term278206, term278206.getClass(), "ext4", 0);
        setIntField(term278206, term278206.getClass(), "ext5", 0);
        setIntField(term278206, term278206.getClass(), "ext6", 0);
        setIntField(term278206, term278206.getClass(), "ext7", 0);
        setIntField(term278206, term278206.getClass(), "ext8", 0);
        setIntField(term278206, term278206.getClass(), "ext9", 0);
        setIntField(term278206, term278206.getClass(), "ext10", 0);
        setField(term278206, term278206.getClass(), "extStr1", null);
        setField(term278206, term278206.getClass(), "extStr2", null);
        setLongField(term278206, term278206.getClass(), "extLong1", 0L);
        setLongField(term278206, term278206.getClass(), "extLong2", 0L);
        setField(term278206, term278206.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term278206, term278206.getClass(), "isNetBattleHost", false);
        setIntField(term278206, term278206.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term278206, args);
    }

};


