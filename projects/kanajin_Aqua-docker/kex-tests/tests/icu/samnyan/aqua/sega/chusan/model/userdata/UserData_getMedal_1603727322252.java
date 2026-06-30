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

public class UserData_getMedal_1603727322252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280978;

    public UserData_getMedal_1603727322252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280978 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term280978, term280978.getClass(), "id", 0L);
        setField(term280978, term280978.getClass(), "card", null);
        setField(term280978, term280978.getClass(), "userName", null);
        setIntField(term280978, term280978.getClass(), "level", 0);
        setIntField(term280978, term280978.getClass(), "reincarnationNum", 0);
        setField(term280978, term280978.getClass(), "exp", null);
        setLongField(term280978, term280978.getClass(), "point", 0L);
        setLongField(term280978, term280978.getClass(), "totalPoint", 0L);
        setIntField(term280978, term280978.getClass(), "playCount", 0);
        setIntField(term280978, term280978.getClass(), "multiPlayCount", 0);
        setIntField(term280978, term280978.getClass(), "playerRating", 0);
        setIntField(term280978, term280978.getClass(), "highestRating", 0);
        setIntField(term280978, term280978.getClass(), "nameplateId", 0);
        setIntField(term280978, term280978.getClass(), "frameId", 0);
        setIntField(term280978, term280978.getClass(), "characterId", 0);
        setIntField(term280978, term280978.getClass(), "trophyId", 0);
        setIntField(term280978, term280978.getClass(), "playedTutorialBit", 0);
        setIntField(term280978, term280978.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term280978, term280978.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term280978, term280978.getClass(), "totalMapNum", 0);
        setLongField(term280978, term280978.getClass(), "totalHiScore", 0L);
        setLongField(term280978, term280978.getClass(), "totalBasicHighScore", 0L);
        setLongField(term280978, term280978.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term280978, term280978.getClass(), "totalExpertHighScore", 0L);
        setLongField(term280978, term280978.getClass(), "totalMasterHighScore", 0L);
        setLongField(term280978, term280978.getClass(), "totalUltimaHighScore", 0L);
        setField(term280978, term280978.getClass(), "eventWatchedDate", null);
        setIntField(term280978, term280978.getClass(), "friendCount", 0);
        setField(term280978, term280978.getClass(), "firstGameId", null);
        setField(term280978, term280978.getClass(), "firstRomVersion", null);
        setField(term280978, term280978.getClass(), "firstDataVersion", null);
        setField(term280978, term280978.getClass(), "firstPlayDate", null);
        setField(term280978, term280978.getClass(), "lastGameId", null);
        setField(term280978, term280978.getClass(), "lastRomVersion", null);
        setField(term280978, term280978.getClass(), "lastDataVersion", null);
        setField(term280978, term280978.getClass(), "lastLoginDate", null);
        setField(term280978, term280978.getClass(), "lastPlayDate", null);
        setIntField(term280978, term280978.getClass(), "lastPlaceId", 0);
        setField(term280978, term280978.getClass(), "lastPlaceName", null);
        setField(term280978, term280978.getClass(), "lastRegionId", null);
        setField(term280978, term280978.getClass(), "lastRegionName", null);
        setField(term280978, term280978.getClass(), "lastAllNetId", null);
        setField(term280978, term280978.getClass(), "lastClientId", null);
        setField(term280978, term280978.getClass(), "lastCountryCode", null);
        setField(term280978, term280978.getClass(), "userNameEx", null);
        setField(term280978, term280978.getClass(), "compatibleCmVersion", null);
        setIntField(term280978, term280978.getClass(), "medal", 0);
        setIntField(term280978, term280978.getClass(), "mapIconId", 0);
        setIntField(term280978, term280978.getClass(), "voiceId", 0);
        setIntField(term280978, term280978.getClass(), "avatarWear", 0);
        setIntField(term280978, term280978.getClass(), "avatarHead", 0);
        setIntField(term280978, term280978.getClass(), "avatarFace", 0);
        setIntField(term280978, term280978.getClass(), "avatarSkin", 0);
        setIntField(term280978, term280978.getClass(), "avatarItem", 0);
        setIntField(term280978, term280978.getClass(), "avatarFront", 0);
        setIntField(term280978, term280978.getClass(), "avatarBack", 0);
        setIntField(term280978, term280978.getClass(), "classEmblemBase", 0);
        setIntField(term280978, term280978.getClass(), "classEmblemMedal", 0);
        setIntField(term280978, term280978.getClass(), "stockedGridCount", 0);
        setIntField(term280978, term280978.getClass(), "exMapLoopCount", 0);
        setIntField(term280978, term280978.getClass(), "netBattlePlayCount", 0);
        setIntField(term280978, term280978.getClass(), "netBattleWinCount", 0);
        setIntField(term280978, term280978.getClass(), "netBattleLoseCount", 0);
        setIntField(term280978, term280978.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term280978, term280978.getClass(), "charaIllustId", 0);
        setIntField(term280978, term280978.getClass(), "skillId", 0);
        setIntField(term280978, term280978.getClass(), "overPowerPoint", 0);
        setIntField(term280978, term280978.getClass(), "overPowerRate", 0);
        setIntField(term280978, term280978.getClass(), "overPowerLowerRank", 0);
        setIntField(term280978, term280978.getClass(), "avatarPoint", 0);
        setIntField(term280978, term280978.getClass(), "battleRankId", 0);
        setIntField(term280978, term280978.getClass(), "battleRankPoint", 0);
        setIntField(term280978, term280978.getClass(), "eliteRankPoint", 0);
        setIntField(term280978, term280978.getClass(), "netBattle1stCount", 0);
        setIntField(term280978, term280978.getClass(), "netBattle2ndCount", 0);
        setIntField(term280978, term280978.getClass(), "netBattle3rdCount", 0);
        setIntField(term280978, term280978.getClass(), "netBattle4thCount", 0);
        setIntField(term280978, term280978.getClass(), "netBattleCorrection", 0);
        setIntField(term280978, term280978.getClass(), "netBattleErrCnt", 0);
        setIntField(term280978, term280978.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term280978, term280978.getClass(), "battleRewardStatus", 0);
        setIntField(term280978, term280978.getClass(), "battleRewardIndex", 0);
        setIntField(term280978, term280978.getClass(), "battleRewardCount", 0);
        setIntField(term280978, term280978.getClass(), "ext1", 0);
        setIntField(term280978, term280978.getClass(), "ext2", 0);
        setIntField(term280978, term280978.getClass(), "ext3", 0);
        setIntField(term280978, term280978.getClass(), "ext4", 0);
        setIntField(term280978, term280978.getClass(), "ext5", 0);
        setIntField(term280978, term280978.getClass(), "ext6", 0);
        setIntField(term280978, term280978.getClass(), "ext7", 0);
        setIntField(term280978, term280978.getClass(), "ext8", 0);
        setIntField(term280978, term280978.getClass(), "ext9", 0);
        setIntField(term280978, term280978.getClass(), "ext10", 0);
        setField(term280978, term280978.getClass(), "extStr1", null);
        setField(term280978, term280978.getClass(), "extStr2", null);
        setLongField(term280978, term280978.getClass(), "extLong1", 0L);
        setLongField(term280978, term280978.getClass(), "extLong2", 0L);
        setField(term280978, term280978.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term280978, term280978.getClass(), "isNetBattleHost", false);
        setIntField(term280978, term280978.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMedal", argTypes, term280978, args);
    }

};


