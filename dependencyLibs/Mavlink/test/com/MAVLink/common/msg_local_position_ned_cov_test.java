/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */
         
// MESSAGE LOCAL_POSITION_NED_COV PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Parser;
import com.MAVLink.ardupilotmega.CRC;
import java.nio.ByteBuffer;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
* The filtered local position (e.g. fused computer vision and accelerometers). Coordinate frame is right-handed, Z-axis down (aeronautical frame, NED / north-east-down convention)
*/
public class msg_local_position_ned_cov_test{

public static final int MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV = 64;
public static final int MAVLINK_MSG_LENGTH = 229;
private static final long serialVersionUID = MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV;

private Parser parser = new Parser();

public CRC generateCRC(byte[] packet){
    CRC crc = new CRC();
    for (int i = 1; i < packet.length - 2; i++) {
        crc.update_checksum(packet[i] & 0xFF);
    }
    crc.finish_checksum(MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV);
    return crc;
}

public byte[] generateTestPacket(){
    ByteBuffer payload = ByteBuffer.allocate(6 + MAVLINK_MSG_LENGTH + 2);
    payload.put((byte)MAVLinkPacket.MAVLINK_STX); //stx
    payload.put((byte)MAVLINK_MSG_LENGTH); //len
    payload.put((byte)0); //seq
    payload.put((byte)255); //sysid
    payload.put((byte)190); //comp id
    payload.put((byte)MAVLINK_MSG_ID_LOCAL_POSITION_NED_COV); //msg id
    payload.putLong((long)93372036854775807L); //time_utc
    payload.putInt((int)963497880); //time_boot_ms
    payload.putFloat((float)101.0); //x
    payload.putFloat((float)129.0); //y
    payload.putFloat((float)157.0); //z
    payload.putFloat((float)185.0); //vx
    payload.putFloat((float)213.0); //vy
    payload.putFloat((float)241.0); //vz
    payload.putFloat((float)269.0); //ax
    payload.putFloat((float)297.0); //ay
    payload.putFloat((float)325.0); //az
    //covariance
    payload.putFloat((float)353.0);
    payload.putFloat((float)354.0);
    payload.putFloat((float)355.0);
    payload.putFloat((float)356.0);
    payload.putFloat((float)357.0);
    payload.putFloat((float)358.0);
    payload.putFloat((float)359.0);
    payload.putFloat((float)360.0);
    payload.putFloat((float)361.0);
    payload.putFloat((float)362.0);
    payload.putFloat((float)363.0);
    payload.putFloat((float)364.0);
    payload.putFloat((float)365.0);
    payload.putFloat((float)366.0);
    payload.putFloat((float)367.0);
    payload.putFloat((float)368.0);
    payload.putFloat((float)369.0);
    payload.putFloat((float)370.0);
    payload.putFloat((float)371.0);
    payload.putFloat((float)372.0);
    payload.putFloat((float)373.0);
    payload.putFloat((float)374.0);
    payload.putFloat((float)375.0);
    payload.putFloat((float)376.0);
    payload.putFloat((float)377.0);
    payload.putFloat((float)378.0);
    payload.putFloat((float)379.0);
    payload.putFloat((float)380.0);
    payload.putFloat((float)381.0);
    payload.putFloat((float)382.0);
    payload.putFloat((float)383.0);
    payload.putFloat((float)384.0);
    payload.putFloat((float)385.0);
    payload.putFloat((float)386.0);
    payload.putFloat((float)387.0);
    payload.putFloat((float)388.0);
    payload.putFloat((float)389.0);
    payload.putFloat((float)390.0);
    payload.putFloat((float)391.0);
    payload.putFloat((float)392.0);
    payload.putFloat((float)393.0);
    payload.putFloat((float)394.0);
    payload.putFloat((float)395.0);
    payload.putFloat((float)396.0);
    payload.putFloat((float)397.0);
    payload.put((byte)177); //estimator_type
    
    CRC crc = generateCRC(payload.array());
    payload.put((byte)crc.getLSB());
    payload.put((byte)crc.getMSB());
    return payload.array();
}

@Test
public void test(){
    byte[] packet = generateTestPacket();
    for(int i = 0; i < packet.length - 1; i++){
        parser.mavlink_parse_char(packet[i] & 0xFF);
    }
    MAVLinkPacket m = parser.mavlink_parse_char(packet[packet.length - 1] & 0xFF);
    byte[] processedPacket = m.encodePacket();
    assertArrayEquals("msg_local_position_ned_cov", processedPacket, packet);
}
}
        