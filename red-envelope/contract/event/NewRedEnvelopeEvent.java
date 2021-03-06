package contract.event;

import contract.model.RedEnvelopeEntity;
import io.nuls.contract.sdk.Address;
import io.nuls.contract.sdk.Event;

public class NewRedEnvelopeEvent implements Event {

    private Long initHeight;
    private Address owner;
    private RedEnvelopeEntity entity;

    public NewRedEnvelopeEvent(Long initHeight, Address owner, RedEnvelopeEntity entity) {
        this.initHeight = initHeight;
        this.owner = owner;
        this.entity = entity;
    }

    public Long getInitHeight() {
        return initHeight;
    }

    public void setInitHeight(Long initHeight) {
        this.initHeight = initHeight;
    }

    public Address getOwner() {
        return owner;
    }

    public void setOwner(Address owner) {
        this.owner = owner;
    }

    public RedEnvelopeEntity getEntity() {
        return entity;
    }

    public void setEntity(RedEnvelopeEntity entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "{\"NewRedEnvelopeEvent\":{"
                + "\"initHeight\":\"" + initHeight + "\""
                + ", \"owner\":" + owner
                + ", \"entity\":" + entity
                + "}}";
    }
}
